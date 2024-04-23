1) Find total claimed_charge of the exported documents.

Ans -> 
SELECT SUM(claimed_charge) AS total_claimed_charge
FROM documents 
WHERE status = 'EXPORTED'

2) Find insured_name, insured_address and claimed_charge for the documents that have status "TO_REPRICE" and customer id 1 and 2.

Ans ->
SELECT insured_name, insured_address, claimed_charge
FROM document d
JOIN batch b ON d.batch_id = b.id
JOIN batch b ON d.batch_id = b.id
WHERE d.status = 'TO_REPRICE' AND b.customer_id IN (1,2);