-- Define the enum type
CREATE TYPE status_enum AS ENUM ('pending', 'completed');

-- Add the description and status columns to the task_tbl table
ALTER TABLE task_tbl
ADD description TEXT,
ADD status status_enum;
