CREATE TABLE `assistances` (
                               `id` bigint NOT NULL AUTO_INCREMENT,
                               `description` varchar(255) NOT NULL,
                               `name` varchar(150) NOT NULL,
                               PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO assistances (name, description) VALUES ('Troca de aparelho', 'Troca de aparelho decodificador de sinal');
INSERT INTO assistances (name, description) VALUES ('Troca de cabo interno', 'Troca de cabo interno');
INSERT INTO assistances (name, description) VALUES ('Troca de fiação interna', 'Substituição de fiação interna da residência');
INSERT INTO assistances (name, description) VALUES ('Manutenção em fogão', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances (name, description) VALUES ('Manutenção em geladeira', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances (name, description) VALUES ('Manutenção em máquina de lavar', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances (name, description) VALUES ('Manutenção em Air Fryer', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances (name, description) VALUES ('Manutenção em televisores', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances (name, description) VALUES ('Manutenção de freezer', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances (name, description) VALUES ('Troca de fibra óptica', 'Troca de cabo externo');
INSERT INTO assistances (name, description) VALUES ('Troca de orelhão', 'Compra de peças para reparo de orelhão');
INSERT INTO assistances (name, description) VALUES ('Reparo de aparelhos de ar condicionado', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances (name, description) VALUES ('Manutenção de sistemas de energia solar', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances (name, description) VALUES ('Manutenção de fornos elétricos', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances (name, description) VALUES ('Configuração de centrais de alarme residencial', 'Configuração dos alarmes');
INSERT INTO assistances (name, description) VALUES ('Manutenção de sistemas de iluminação pública', 'Reparo sem necessidade de compra de peças');

