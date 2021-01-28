create table if not exists imagens (
	id serial primary key,
	produto varchar, 
	fornecedor varchar, 
	miniatura varchar, 
	urlimagem varchar, 
	urlminiimg varchar
);
