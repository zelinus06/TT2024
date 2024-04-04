select * from orders;
SHOW WARNINGS;
-- Câu 1:
EXPLAIN SELECT * FROM information WHERE age > 25;

EXPLAIN SELECT name FROM information WHERE age > 25;
CREATE INDEX idx_age ON information(age);
DROP INDEX idx_age ON information;

-- Câu 2:
CREATE INDEX idx_name ON product(name);
drop INDEX idx_name ON product;

EXPLAIN SELECT customer_name
FROM `orders`
WHERE id_product IN (SELECT id_product FROM product WHERE name = 'Coca');

EXPLAIN SELECT orders.customer_name
FROM `orders` 
JOIN product ON orders.id_product = product.id_product
WHERE product.name = 'Coca';

-- select benchmark(100000000,(SELECT customer_name
-- FROM `orders`
-- WHERE id_product IN (SELECT id_product FROM product WHERE name = 'Coca')));

-- select benchmark(100000000, (SELECT orders.customer_name
-- FROM `orders` 
-- JOIN product ON orders.id_product = product.id_product
-- WHERE product.name = 'Coca'));

 -- Câu 3
EXPLAIN 
SELECT *
FROM `orders`
WHERE order_time < '2025-03-27';

explain 
SELECT *
FROM `orders`
WHERE YEAR(order_time) < 2025;

-- Câu 4
EXPLAIN SELECT * FROM product WHERE name LIKE 'Milk%';

EXPLAIN SELECT id_product FROM product WHERE name = 'Milk';

-- Câu 5:



















