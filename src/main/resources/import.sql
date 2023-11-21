INSERT INTO categorias (nome) VALUES ('Livros');
INSERT INTO categorias (nome) VALUES ('Eletrônicos');
INSERT INTO categorias (nome) VALUES ('Computadores');

INSERT INTO produtos (nome, preco) VALUES ('O senhor dos Aneis', 90.5);
INSERT INTO produtos (nome, preco) VALUES ('PC laptop I9', 290.95);
INSERT INTO produtos (nome, preco) VALUES ('Celular Nokia', 190.5);
INSERT INTO produtos (nome, preco) VALUES ('TV LCD 89Pol', 2090.10);

INSERT INTO tb_join (produto_id, categoria_id) VALUES (1,1);
INSERT INTO tb_join (produto_id, categoria_id) VALUES (2,2);
INSERT INTO tb_join (produto_id, categoria_id) VALUES (2,3);
INSERT INTO tb_join (produto_id, categoria_id) VALUES (3,3);
INSERT INTO tb_join (produto_id, categoria_id) VALUES (4,3);
