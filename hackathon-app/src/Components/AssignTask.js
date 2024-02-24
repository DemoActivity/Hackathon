import axios from "axios";
import React, { useEffect, useState } from "react";

const AssignTask = () => {
  const [courses, setCourses] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const fetchCourses = async () => {
      try {
        const response = await axios.get("http://localhost:8080/courses");

        console.log("Response Data: ", response.data);
        setCourses(response.data);
        setLoading(false);
      } catch (error) {
        console.log(error);
        setLoading(false);
      }
    };
    fetchCourses();
  }, []);
  return (
    <div>
      <label htmlFor="selectCourse">Select Course:</label>
      <select id="selectCourse" name="selectCourse">
        {loading ? (
          <option value="">Loading...</option>
        ) : (
          courses.map((course) => (
            <option key={course.c_id} value={course.c_name}>
              {course.c_name}
            </option>
          ))
        )}
      </select>
    </div>
  );
};

export default AssignTask;
