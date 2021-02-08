INSERT INTO tb_usuario(nome, email, cpf, nascimento) VALUES ('Cleber', 'cleber@gmail.com', '12345678935',TIMESTAMP WITH TIME ZONE '2001-01-01');
INSERT INTO tb_usuario(nome, email, cpf, nascimento) VALUES ('Renato', 'renato@gmail.com', '63598632147',TIMESTAMP WITH TIME ZONE '2000-01-07');
INSERT INTO tb_usuario(nome, email, cpf, nascimento) VALUES ('Luciana', 'luciana@gmail.com', '54966789365',TIMESTAMP WITH TIME ZONE '1986-09-02');
INSERT INTO tb_usuario(nome, email, cpf, nascimento) VALUES ('Thiago', 'thiago@gmail.com', '35234785123',TIMESTAMP WITH TIME ZONE '1995-07-08');
INSERT INTO tb_usuario(nome, email, cpf, nascimento) VALUES ('Milena', 'milena@gmail.com', '42136536984',TIMESTAMP WITH TIME ZONE '1982-06-04');

INSERT INTO tb_vacina(nome, instante) VALUES ('Pertacel', TIMESTAMP WITH TIME ZONE '2021-02-01T10:00:00Z');
INSERT INTO tb_vacina(nome, instante) VALUES ('Infanrix Penta e Pediacel', TIMESTAMP WITH TIME ZONE '2021-02-03T12:00:00Z');
INSERT INTO tb_vacina(nome, instante) VALUES ('Triplice Viral - SRC', TIMESTAMP WITH TIME ZONE '2021-02-03T12:00:00Z');
INSERT INTO tb_vacina(nome, instante) VALUES ('Tetravalente', TIMESTAMP WITH TIME ZONE '2021-02-03T12:30:00Z');
INSERT INTO tb_vacina(nome, instante) VALUES ('Dupla Adulto - DT', TIMESTAMP WITH TIME ZONE '2021-02-03T12:13:00Z');


INSERT INTO tb_usuario_vacina(vacina_id, usuario_id) VALUES (1, 3);
INSERT INTO tb_usuario_vacina(vacina_id, usuario_id) VALUES (1, 1);
INSERT INTO tb_usuario_vacina(vacina_id, usuario_id) VALUES (3, 5);
