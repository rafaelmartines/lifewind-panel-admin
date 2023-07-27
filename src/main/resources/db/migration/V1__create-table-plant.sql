CREATE TABLE IF NOT EXISTS plant (
	active bool NOT NULL,
	created_at timestamp(6) NULL,
	plant_id bigserial NOT NULL,
	updated_at timestamp(6) NULL,
	name varchar(255) NULL,
	CONSTRAINT plant_pkey PRIMARY KEY (plant_id)
);