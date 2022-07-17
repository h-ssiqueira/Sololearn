# SQL
* [Cakes](SQL/Cakes.sql)

A local bakery creates unique cake sets. Each cake set contains three different cakes.

Here is the **cakes** table:

name | calories
:---: | :---:
Apple Cake | 100
Banana Cake | 200
Pound Cake | 180
Sponge Cake | 100
Genoise Cake | 360
Chiffon Cake | 250
Opera Cake | 90
Cheese Cake | 370

Тoday a customer want a cake set that has minimal calories.

Write a query to sort the cakes by calorie count and select the first 3 cakes from the list to offer the customer.

* [Apartments](SQL/Apartments.sql)

You want to rent an apartment and have the following table named **Apartments**:

id | city | address | price | status
:---: | :---: | :---: | :---: | :---:
1 | Las Vegas | 732 Hall Street | 1000 | Not rented
2 | Marlboro | 985 Huntz Lane | 800 | Not rented
3 | Moretown | 3757 Wines Lane | 700 | Not rented
4 | Owatonna | 314 Pritchard Court | 500 | Rented
5 | Grayslake | 3234 Cunningham Court | 600 | Rented
6 | Great Neck | 1927 Romines Mail Road | 900 | Not Rented

write a query to output the apartments whose prices **are greater than the average** and are also **not rented**, sorted by the 'Price' column.

* [Zoo](SQL/Zoo.sql)


You manage a zoo. Each animal in the zoo comes from a different country. Here are the tables you have:

name | type | country_id
:---: | :---: | :---:
Candy | Elephant | 3
Pop | Horse | 1
Vova | Bear | 2
Merlin | Lion | 1
Bert | Tiger | 3

id | country
:---: | :---:
1 | USA
2 | Russia
3 | India

1) A new animal has come in, with the following details:

name - "Slim", type - "Giraffe", country_id - 1
Add him to the Animals table.

2) You want to make a complete list of the animals for the zoo’s visitors. Write a query to output a new table with each animal's name, type and country fields, sorted by countries.
