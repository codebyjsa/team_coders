import React from 'react'
import JobListing from './jobListing.jsx'
import { useState, useEffect } from 'react';
import Spinner from './Spinner.jsx';

const JobListings = ({isHome = false}) => {
    // const jobListings = isHome ? jobs.slice(0,3) : jobs; // Get the last 3 jobs from the jobs array
  const [jobs, setJobs] = useState([]);
  const[loading, setLoading] = useState(true);

  useEffect(() => {
    const fetchJobs = async () => {
      const apiUrl = isHome ? '/api/jobs?_limit=3' : '/api/jobs'; // Adjust the API URL based on isHome prop
      try{const res = await fetch(apiUrl); // Fetch jobs from the JSON server
      const data = await res.json(); // Parse the JSON response
      setJobs(data); // Set the jobs state with the fetched data
      }catch (error) {
        console.error('Error fetching jobs:', error); // Log any errors that occur during the fetch
      } finally {
        setLoading(false); // Set loading to false after fetching is complete
      }
    };
    fetchJobs();
  }, []);

  return (
    <section className="bg-blue-50 px-4 py-10">
      <div className="container-xl lg:container m-auto">
        <h2 className="text-3xl font-bold text-indigo-500 mb-6 text-center">
          {isHome ? 'Recent Jobs' : 'Browse Jobs'}
        </h2>
        {loading ? (
          <Spinner loading={loading} />
        ) : (
          <div className="grid grid-cols-1 md:grid-cols-3 gap-6">
            {(jobs).map((job) => (
              <JobListing key={job.id} job={job} />
            ))}
          </div>
        )}
      </div>
    </section>
  )
}

export default JobListings