-- User
INSERT INTO users (uuid, first_name, last_name, email, password, created_at, updated_at, deleted_at)
VALUES
('965aab64-2d27-4391-ad95-3fc3736d1045', 'cvc', 'user', 'cvc@email.com', '123', NOW(), NOW(), null);

-- travel_package
INSERT INTO travel_package (uuid, description, travel_date, localization, initial_date, end_date, created_at, updated_at, deleted_at)
VALUES
('11b87c85-c615-457d-93ed-a1292e9df54a', 'Viagem para Disney', NOW(), 'Estados Unidos', NOW(), NOW(), NOW(), NOW(), null);

--evaluations
INSERT INTO evaluations (uuid, question, created_at, updated_at, deleted_at)
VALUES
('fd5c9610-c72b-40e2-913c-e12bbdf23b87', 'Gostou do hotel XPTO ?', NOW(), NOW(), null);

INSERT INTO evaluations (uuid, question, created_at, updated_at, deleted_at)
VALUES
('818db7bf-9499-4b40-bb98-9f7036f11e77', 'Gostou do cardapio ?', NOW(), NOW(), null);

--travel_package_evaluation
INSERT INTO travel_package_evaluation (uuid, travel_package_uuid, evaluation_uuid, user_uuid, travel_note, image_url, created_at, updated_at, deleted_at)
VALUES
('e1026867-8b28-4438-9e5b-d59cfe6375df',
'11b87c85-c615-457d-93ed-a1292e9df54a',
'fd5c9610-c72b-40e2-913c-e12bbdf23b87',
'965aab64-2d27-4391-ad95-3fc3736d1045',8.9,'s3://nome-bucket/travel-package/user-uuid/',NOW(), NOW(), null);

--travel_package_evaluation
INSERT INTO travel_package_evaluation (uuid, travel_package_uuid, evaluation_uuid, user_uuid, travel_note, image_url, created_at, updated_at, deleted_at)
VALUES
('589be0bc-d139-4934-b546-706d674f6ce6',
'11b87c85-c615-457d-93ed-a1292e9df54a',
'818db7bf-9499-4b40-bb98-9f7036f11e77',
'965aab64-2d27-4391-ad95-3fc3736d1045',7.8,'s3://nome-bucket/travel-package/user-uuid/',NOW(), NOW(), null);