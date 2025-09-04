import React from 'react'
import {Route, RouterProvider, createBrowserRouter, createRoutesFromElements} from 'react-router-dom'
import MainLayout from './Layout/MainLayout.jsx'
import HomePage from './pages/HomePage.jsx'
import JobListings from './components/jobListings.jsx'
import JobPage, { jobLoader } from './pages/JobPage.jsx'
import NotFoundPage from './pages/NotFoundPage.jsx'
import AddJobPages from './pages/AddJobPages.jsx'
import EditJobPage from './pages/EditJobPage.jsx'

const App = () => {
  //Add new job
  const addJob = async (newJob) => {
    const res = await fetch('/api/jobs', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(newJob),
    });
    return res.json();
  }

  //Delete Job
  const deleteJob = async (id) => {
    const res = await fetch(`/api/jobs/${id}`, {
      method: 'DELETE',
    });
    return res.json();
  }

  //Update Job
  const updateJob = async (job) => {
    const res = await fetch(`/api/jobs/${job.id}`, {
      method: 'PUT',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(job),
    });
    return res.json();
  }

  // Wrapper component to provide deleteJob function
  const JobPageWrapper = () => <JobPage deleteJob={deleteJob} />

  const router = createBrowserRouter(
    createRoutesFromElements(
      <Route path='/' element={<MainLayout/>}>
        <Route index element={<HomePage/>}/>
        <Route path='/jobs' element={<JobListings isHome={false}/>}/>
        <Route path='/add-job' element={<AddJobPages addJobSubmit={addJob}/>}/>
        <Route path='/edit-job/:id' element={<EditJobPage updateJobSubmit={updateJob}/>} loader={jobLoader}/>
        <Route path='/jobs/:id' element={<JobPageWrapper deleteJob={deleteJob}/>} loader={jobLoader}/>
        <Route path='*' element={<NotFoundPage/>}/>
      </Route>
    )
  )

  return <RouterProvider router={router}/>
}

export default App