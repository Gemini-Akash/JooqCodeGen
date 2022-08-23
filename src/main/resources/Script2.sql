GO
/****** Object:  Table dbo.acc_monitor_log    Script Date: 3/24/2022 4:40:30 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE dbo.acc_monitor_log(
	id int NOT NULL,
	create_time datetime NULL,
	status smallint NOT NULL ,
	t datetime NULL,
	pin nvarchar(20) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	card_no nvarchar(20) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	device_id int NULL,
	device_sn nvarchar(20) COLLATE SQL_Latin1_General_CP1_CI_AS NOT NULL,
	device_name nvarchar(20) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	verified int NULL ,
	state int NULL,
	state_name nvarchar(30) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	event_type smallint NULL,
	trigger_opt smallint NULL ,
	event_point_type smallint NULL ,
	event_point_id int NULL,
	event_point_name nvarchar(50) COLLATE SQL_Latin1_General_CP1_CI_A NULL,
	description nvarchar(max) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	firstname nvarchar(24) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	lastname nvarchar(20) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	dept nvarchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	area nvarchar(30) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
)

