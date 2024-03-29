USE [practice]
GO
/****** Object:  StoredProcedure [dbo].[rel_nos_sort]    Script Date: 12/14/2014 7:47:31 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		Neelesh Nidadhavolu
-- Description:	Sort the data in the table either by name or by number
-- =============================================
ALTER PROCEDURE [dbo].[rel_nos_sort] @sort_by varchar(10)
AS
BEGIN
	if @sort_by = 'name'
	select * from practice.dbo.rel_nos order by rel_name
	else if @sort_by = 'number'
	select * from practice.dbo.rel_nos order by rel_no
	else
	select * from practice.dbo.rel_nos
END
