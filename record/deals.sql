create table deal
(
  dealID      int auto_increment
    primary key,
  description varchar(45) null,
  discount    double      null,
  typeID      int         null
);

create table dealtype
(
  typeID        int auto_increment
    primary key,
  type          varchar(45) null,
  minAge        int         null,
  maxAge        int         null,
  minDate       date        null,
  maxDate       date        null,
  rangeTypeCode int         null
);