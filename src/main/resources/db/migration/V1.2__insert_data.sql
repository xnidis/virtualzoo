insert into species (description) values
	 ('dog'),
	 ('cat'),
	 ('parrot');

insert into animals (id,name,species_id) values
	 ('3c526c53','hermes',1),
	 ('3e5cb766','zeus',2),
	 ('3feaac1b','apollo',3),
	 ('41a5fb6d','hera',1),
	 ('43682757','socrates',2),
	 ('b4520c63','medusa',1),
	 ('b6c3a40d','poseidon',1);

insert into tricks (trick) values
	 ('jump'),
	 ('bark'),
	 ('sing'),
	 ('dance'),
	 ('moonwalk');

insert into animal_tricks (animal_id,trick_id) values
	 ('3c526c53',1),
	 ('3c526c53',2),
	 ('3c526c53',3),
	 ('3e5cb766',1),
	 ('3e5cb766',2),
	 ('3feaac1b',1),
	 ('3feaac1b',3),
	 ('41a5fb6d',1),
	 ('41a5fb6d',3),
	 ('b6c3a40d',1),
	 ('b6c3a40d',2),
	 ('b6c3a40d',4);