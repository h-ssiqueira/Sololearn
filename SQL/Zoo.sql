/* name - "Slim", type - "Giraffe", country_id - 1 */

insert into animals values('Slim','Giraffe','1');

select a.name,a.type,c.country from animals a join countries c on a.country_id = c.id order by c.country;