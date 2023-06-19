# PostgresqlAssignment3
-- CREATE VIEW TO FETCH DATA


CREATE OR REPLACE VIEW v_merge_billing AS
SELECT
	o.order_id,
	c.customer_id,
	c.customer_name,
	i.item_name,
	i.item_price,
	o.quantity,
	o.total_price
FROM items i
INNER JOIN orders o
USING(item_id)
INNER JOIN customers c
USING(customer_id)
WHERE item_category = 'Indian';
