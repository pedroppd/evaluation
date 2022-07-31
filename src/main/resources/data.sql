-- User
INSERT INTO users (uuid, first_name, last_name, email, password)
VALUES
('965aab64-2d27-4391-ad95-3fc3736d1045', 'cvc', 'user', 'cvc@email.com', '123');

-- travel_package
INSERT INTO travel_package (uuid, description, travel_date, localization, initial_date, end_date)
VALUES
('11b87c85-c615-457d-93ed-a1292e9df54a', 'Viagem para Disney', NOW(), 'Estados Unidos', NOW(), NOW());

--questions
INSERT INTO questions (uuid, question)
VALUES
('fd5c9610-c72b-40e2-913c-e12bbdf23b87', 'Gostou do hotel XPTO ?');

INSERT INTO questions (uuid, question)
VALUES
('818db7bf-9499-4b40-bb98-9f7036f11e77', 'Gostou do cardapio ?');
----

--travel_package_evaluation
INSERT INTO evaluations (uuid,
travel_package_uuid,
user_uuid,
question_uuid,
travel_note, travel_comment, image_url, publish_date)
VALUES
('e1026867-8b28-4438-9e5b-d59cfe6375df',
'11b87c85-c615-457d-93ed-a1292e9df54a',
'965aab64-2d27-4391-ad95-3fc3736d1045',
'fd5c9610-c72b-40e2-913c-e12bbdf23b87',
8.9,
'Esqueci de colocar, mas o café não estava bom',
's3://nome-bucket/travel-package/user-uuid/', NOW());

INSERT INTO evaluations (uuid,
travel_package_uuid,
user_uuid,
question_uuid,
travel_note, travel_comment, image_url, publish_date)
VALUES
('88dcd9f2-544b-44fb-895f-e9ea58f6b5f8',
'11b87c85-c615-457d-93ed-a1292e9df54a',
'965aab64-2d27-4391-ad95-3fc3736d1045',
'fd5c9610-c72b-40e2-913c-e12bbdf23b87',
8.9,
'Muito bom',
's3://nome-bucket/travel-package/user-uuid/', NOW());