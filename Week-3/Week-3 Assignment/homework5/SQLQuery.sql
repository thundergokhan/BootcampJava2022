SELECT * FROM Customers     /*        *  demek tüm kolonlarý seç      */
                            /* Yani Customer tablosundan tüm kolonlarý getir demek */
SELECT 
  ContactName,
  CompanyName,
  City 
FROM 
  Customers 
SELECT 
  ContactName Adi, 
  CompanyName Sirketadi, 
  City Sehir 
FROM 
  Customers 
SELECT 
  * 
FROM 
  Customers 
WHERE 
  City = 'London' -- Case sensitive
select 
  * 
from 
  Products 
where 
  categoryId = 1 
  or CategoryId = 3 
SELECT 
  * 
FROM 
  Products 
WHERE 
  categoryId = 1 
  AND UnitPrice >= 10 
SELECT 
  * 
FROM 
  Products 
ORDER BY 
  ProductName 
SELECT 
  * 
FROM 
  Products 
ORDER BY 
  CategoryId, 
  ProductName 
SELECT 
  * 
FROM 
  Products 
ORDER BY 
  UnitPrice asc -- ascending
SELECT 
  * 
FROM 
  Products 
ORDER BY 
  UnitPrice desc -- descending
SELECT 
  * 
FROM 
  Products 
where 
  categoryId = 1 
ORDER BY 
  UnitPrice desc -- descending
SELECT 
  COUNT(*) 
from 
  Products 
SELECT 
  COUNT(*) 
from 
  Products 
where 
  CategoryId = 2 
SELECT 
  COUNT(*) Adet 
from 
  Products 
where 
  CategoryId = 2 
SELECT 
  * 
FROM 
  products 
GROUP BY 
  CategoryId 
SELECT 
  categoryId 
FROM 
  products 
GROUP BY 
  CategoryId 
SELECT 
  categoryId, 
  COUNT(*) 
FROM 
  products 
WHERE 
  UnitPrice > 20 
GROUP BY 
  CategoryId 
HAVING 
  COUNT(*) < 10                    /* 10dan az ürün olan kategorilerini getir */
SELECT 
  Products.ProductId, 
  Products.ProductName, 
  Products.UnitPrice, 
  Categories.CategoryName 
FROM 
  Products 
  INNER JOIN Categories ON Products.CategoryId = Categories.CategoryId
Select 
  * 
from 
  Products p 
  inner join [Order Details] od on p.ProductId = od.ProductId 

Select                     /* ikiden fazla tabloyu join eder */
  * 
from 
  Products p 
  left join [Order Details] od on p.ProductId = od.ProductId 
Select 
  * 
from 
  Customers c 
  left join Orders o on c.CustomerId = o.CustomerId 
where 
  o.CustomerId is null 
Select 
  * 
from 
  Customers c 
  right join Orders o on c.CustomerId = o.CustomerId 
where 
  o.CustomerId is null

  /* SQL Formatter ile düzenlemek için site linkide býrakýyorum  --->  " https://codebeautify.org/sqlformatter " */