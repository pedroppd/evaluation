INSERT INTO users (uuid, first_name, last_name, email, password, created_at, updated_at, deleted_at)
VALUES
('965aab64-2d27-4391-ad95-3fc3736d1045', 'cvc', 'user', 'cvc@email.com', '123', NOW(), NOW(), null);

INSERT INTO travel_package (uuid, description, travel_date, localization, initial_date, end_date, created_at, updated_at, deleted_at)
VALUES
('11b87c85-c615-457d-93ed-a1292e9df54a', 'Viagem para Disney', NOW(), 'Estados Unidos', NOW(), NOW(), NOW(), NOW(), null);

INSERT INTO evaluations (uuid, question, created_at, updated_at, deleted_at)
VALUES
('fd5c9610-c72b-40e2-913c-e12bbdf23b87', 'Gostou do hotel XPTO ?', NOW(), NOW(), null);


INSERT INTO evaluations (uuid, question, created_at, updated_at, deleted_at)
VALUES
('fd5c9610-c72b-40e2-913c-e12bbdf23b87', 'Gostou do hotel XPTO ?', NOW(), NOW(), null);