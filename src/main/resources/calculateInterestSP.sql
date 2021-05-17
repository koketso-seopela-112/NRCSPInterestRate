CREATE PROCEDURE `calculate_interest` (
IN `repo_rate_in` float,
IN `amount_in` double, 
IN `agreement_in` varchar(500),
IN `start_in` date,
IN `end_in` date)
BEGIN
select (amount_in * (((repo_rate_in *2)+ s.rate))/100) * ((datediff(start_in,end_in)* -1)/365)
    from `ksquareddb`.`specification` s
    where s.agreement_type = agreement_in;
END
