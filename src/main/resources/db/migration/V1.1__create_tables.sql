create table  if not exists species (
	id bigint not null auto_increment,
	description varchar(100),
    primary key (id)
);

create table if not exists animals (
	id varchar(100) not null,
	name varchar(100),
	species_id bigint,
	primary key (id)
);

create table if not exists tricks (
  id bigint not null auto_increment,
  trick varchar(100) not null,
  primary key (id)
);

create table if not exists animal_tricks (
  id bigint not null auto_increment,
  animal_id varchar(100) not null,
  trick_id bigint not null,
  primary key (id),
  foreign key (`animal_id`) references `animals` (`id`),
  foreign key (`trick_id`) references `tricks` (`id`)
);

--
alter table `animals` add constraint `fk_animals_species` foreign key (`species_id`) references `species` (`id`);
alter table `animal_tricks` add unique `uq_animal_tricks`(animal_id, trick_id);