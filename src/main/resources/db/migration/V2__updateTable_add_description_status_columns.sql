ALTER TABLE task_tbl
ADD COLUMN description VARCHAR(255);

-- Add status column with enum type
DO $$
BEGIN
    IF NOT EXISTS (SELECT 1 FROM pg_type WHERE typname = 'status_enum') THEN
        CREATE TYPE status_enum AS ENUM ('pending', 'completed');
    END IF;
END$$;

ALTER TABLE task_tbl
ADD COLUMN status status_enum;
