
USE [bdUsuario]
GO

/****** Object:  Table [dbo].[usuarios]    Script Date: 06/04/2012 11:12:30 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[usuarios](
	[usuCod] [int] NOT NULL,
	[usuNome] [varchar](40) NULL,
	[usuEmail] [varchar](40) NULL,
	[usuTipo] [varchar](15) NULL,
	[usuLogin] [varchar](20) NULL,
	[usuSenha] [varchar](12) NULL,
PRIMARY KEY CLUSTERED 
(
	[usuCod] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO


