
CREATE DATABASE projeto_imagens
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       CONNECTION LIMIT = -1;





CREATE SEQUENCE serialimagens
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 2
  CACHE 1;
ALTER TABLE serialimagens
  OWNER TO postgres;

  
  
 CREATE TABLE  imagens (
  id bigint NOT NULL DEFAULT nextval('serialimagens'::regclass),
  produto VARCHAR(500) NULL,
  fornecedor VARCHAR(500) NULL,
  miniatura VARCHAR(200) NULL,
  urlimagem  text ,
  urlminiimg text ,
  CONSTRAINT imagens_pkey PRIMARY KEY (id))
  WITH (
  OIDS=FALSE
);
ALTER TABLE imagens
  OWNER TO postgres;




 