# Write your MySQL query statement below
SELECT st.student_id, st.student_name, sub.subject_name, COUNT(e.subject_name) as attended_exams
FROM Students st
JOIN Subjects sub
LEFT JOIN Examinations e
ON st.student_id = e.student_id
AND sub.subject_name = e.subject_name
GROUP BY st.student_id, sub.subject_name
ORDER BY student_id ASC, subject_name ASC;