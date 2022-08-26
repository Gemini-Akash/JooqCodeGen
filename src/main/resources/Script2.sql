GO
/****** Object:  Table [dbo].[AllocationTypeMaster]    Script Date: 3/24/2022 4:40:30 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE language (
  id              NUMBER(7)     NOT NULL PRIMARY KEY,
  cd              CHAR(2)       NOT NULL,
  description     VARCHAR2(50)
);

CREATE TABLE [AllocationTypeMaster](
	[AllocationTypeId] [int] NOT NULL,
	[AllocationTypeName] [varchar](50) COLLATE SQL_Latin1_General_CP1_CI_AS NOT NULL,
	[SequenceNo] [int] NOT NULL,
	[IsActive] [bit] NOT NULL ,
	[CreatedBy] [int] NOT NULL,
	[CreatedOn] [datetime] NOT NULL,
	[ModifiedBy] [int] NULL,
	[ModifiedOn] [datetime] NULL,
	[language_id] [int] NOT NULL,
	PRIMARY KEY CLUSTERED (
	[AllocationTypeId] ASC
	),
	CONSTRAINT fk_book_language   FOREIGN KEY ([language_id]) REFERENCES language(id)
)
