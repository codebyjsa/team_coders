package com.codespace.junit_rest_api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.cef.callback.CefContextMenuParams;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.assertj.MockMvcTester;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.Matchers.*;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class BookConrollerTest {

    private MockMvc mockMvc;

    ObjectMapper objectMapper = new ObjectMapper();
    ObjectWriter objectWriter = objectMapper.writer();

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookController bookController;

    Book RECORD_1 = new Book(1L, "Atomic Habits", "How to build better", 5);
    Book RECORD_2 = new Book(2L, "Thinking Fast and Slow", "How to build better", 5);
    Book RECORD_3 = new Book(3L, "Grokking Algorithms", "How to build better", 5);
    Book RECORD_4 = new Book(4L, "Power of Subconcious mind", "How to build better", 5);
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(bookController).build();
    }

    @Test
    public void testGetAllBooks_success() throws Exception {

        List<Book> records = new ArrayList<>(Arrays.asList(RECORD_1,RECORD_2,RECORD_3, RECORD_4));

        Mockito.when(bookRepository.findAll()).thenReturn(records);

        mockMvc.perform(MockMvcRequestBuilders
                        .get("/book")
                        .contentType(MediaType.APPLICATION_JSON))
                        .andExpect(status().isOk())
                        .andExpect(MockMvcResultMatchers.jsonPath("$", hasSize(4)))
                        .andExpect(MockMvcResultMatchers.jsonPath("$[1].name", Matchers.is("Thinking Fast and Slow")))
                        .andExpect(MockMvcResultMatchers.jsonPath("$[2].name", Matchers.is("Grokking Algorithms")));

    }

    @Test
    public void testGetBookById_success() throws Exception {

        Mockito.when(bookRepository.findById(RECORD_1.getBookId())).thenReturn(java.util.Optional.of(RECORD_1));

        mockMvc.perform(MockMvcRequestBuilders
                        .get("/book/1")
                        .contentType(MediaType.APPLICATION_JSON))
                        .andExpect(status().isOk())
                        .andExpect(MockMvcResultMatchers.jsonPath("$", notNullValue()))
                        .andExpect(MockMvcResultMatchers.jsonPath("$.name", Matchers.is("Atomic Habits")))
//                        .andExpect(MockMvcResultMatchers.jsonPath("$.author", Matchers.is("How to build better")))
                        .andExpect(MockMvcResultMatchers.jsonPath("$.rating", Matchers.is(5)));

    }

    @Test
    public void testCreateRecord_success() throws Exception {

        Book record = Book.builder()
                .bookId(4L)
                .name("Introduction to C")
                .summary("How to build better")
                .rating(5)
                .build();

        Mockito.when(bookRepository.save(record)).thenReturn(record);

        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.post("/book")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(objectWriter.writeValueAsString(record)
        );

        mockMvc.perform(mockRequest)
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$", notNullValue()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name", Matchers.is("Introduction to C"))
                );
    }

    @Test
    public void testUpdateRecord_success() throws Exception {

        Book updatedRecord = Book.builder()
                .bookId(4L)
                .name("Introduction to C")
                .summary("How to build better")
                .rating(1)
                .build();

        Mockito.when(bookRepository.findById(RECORD_4.getBookId())).thenReturn(java.util.Optional.of(RECORD_4));
        Mockito.when(bookRepository.save(updatedRecord)).thenReturn(updatedRecord);

        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.put("/book")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(objectWriter.writeValueAsString(updatedRecord)
                );

        mockMvc.perform(mockRequest)
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$", notNullValue()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name", Matchers.is("Introduction to C"))
                );
    }

    @Test
    public void deleteBookById_success() throws Exception {
        Mockito.when(bookRepository.findById(RECORD_2.getBookId()))
                .thenReturn(Optional.of(RECORD_2));

        mockMvc.perform(MockMvcRequestBuilders
                        .delete("/book/2")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }


}