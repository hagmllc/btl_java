USE [quanlitv]
GO
/****** Object:  Table [dbo].[Bao]    Script Date: 8/26/2021 4:19:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Bao](
	[matailieu] [nvarchar](50) NOT NULL,
	[nhaxuatban] [nvarchar](50) NULL,
	[sobanphathanh] [int] NULL,
	[ngayphathanh] [nvarchar](50) NULL,
 CONSTRAINT [PK_Bao] PRIMARY KEY CLUSTERED 
(
	[matailieu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[person]    Script Date: 8/26/2021 4:19:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[person](
	[Tendangnhap] [nvarchar](50) NOT NULL,
	[pass] [nvarchar](20) NULL,
	[tuoi] [int] NULL,
	[gioitinh] [nvarchar](50) NULL,
	[email] [nvarchar](50) NULL,
	[phanquyen] [nvarchar](50) NULL,
	[name] [nvarchar](50) NULL,
 CONSTRAINT [PK_person] PRIMARY KEY CLUSTERED 
(
	[Tendangnhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Sach1]    Script Date: 8/26/2021 4:19:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Sach1](
	[matailieu] [nvarchar](50) NOT NULL,
	[nhaxuatban] [nvarchar](50) NULL,
	[sobanphathanh] [int] NULL,
	[tg] [nvarchar](50) NULL,
	[st] [int] NULL,
 CONSTRAINT [PK_Sach1] PRIMARY KEY CLUSTERED 
(
	[matailieu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tailieu]    Script Date: 8/26/2021 4:19:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tailieu](
	[matailieu] [nvarchar](50) NOT NULL,
	[tennhaxb] [nvarchar](100) NULL,
	[sobanphathanh] [int] NULL,
 CONSTRAINT [PK_tailieu] PRIMARY KEY CLUSTERED 
(
	[matailieu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TapChi]    Script Date: 8/26/2021 4:19:07 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TapChi](
	[matailieu] [nvarchar](50) NOT NULL,
	[nhaxuatban] [nvarchar](50) NULL,
	[sobanphathanh] [int] NULL,
	[sophathanh] [int] NULL,
	[thangphathanh] [int] NULL,
 CONSTRAINT [PK_TapChi] PRIMARY KEY CLUSTERED 
(
	[matailieu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Bao] ([matailieu], [nhaxuatban], [sobanphathanh], [ngayphathanh]) VALUES (N'b01', N'Công an nhân dân', 100, N'05/08/2021')
INSERT [dbo].[Bao] ([matailieu], [nhaxuatban], [sobanphathanh], [ngayphathanh]) VALUES (N'b02', N'Ninh Bình', 100, N'08/08/2021')
INSERT [dbo].[Bao] ([matailieu], [nhaxuatban], [sobanphathanh], [ngayphathanh]) VALUES (N'b04', N'VTV24', 65, N'13/08/2021')
INSERT [dbo].[Bao] ([matailieu], [nhaxuatban], [sobanphathanh], [ngayphathanh]) VALUES (N'b05', N'Khoa học', 50, N'8/8/2021')
GO
INSERT [dbo].[person] ([Tendangnhap], [pass], [tuoi], [gioitinh], [email], [phanquyen], [name]) VALUES (N'admin', N'admin', 21, N'nam', N'abc@gmail.com', N'admin', N'Đặng Công Tuyền')
INSERT [dbo].[person] ([Tendangnhap], [pass], [tuoi], [gioitinh], [email], [phanquyen], [name]) VALUES (N'test1', N'adsdas', 0, N'nam', N'congtuyen033@gmail.com', N'user', N'tuyenpvp')
INSERT [dbo].[person] ([Tendangnhap], [pass], [tuoi], [gioitinh], [email], [phanquyen], [name]) VALUES (N'tuyen', N'admin', 21, N'nam', N'tuyendz@gmail.com', N'user', N'Đặng Công Tuyền')
INSERT [dbo].[person] ([Tendangnhap], [pass], [tuoi], [gioitinh], [email], [phanquyen], [name]) VALUES (N'tuyenpvp', N'abc', 21, N'Nam', N'congtuyen033@gmail.com', N'user', N'tuyenpvp')
GO
INSERT [dbo].[Sach1] ([matailieu], [nhaxuatban], [sobanphathanh], [tg], [st]) VALUES (N's01', N'Giáo dục', 50, N'Hà Mạnh Đào', 150)
INSERT [dbo].[Sach1] ([matailieu], [nhaxuatban], [sobanphathanh], [tg], [st]) VALUES (N's02', N'Sư phạm', 40, N'Phạm Hải Anh', 200)
INSERT [dbo].[Sach1] ([matailieu], [nhaxuatban], [sobanphathanh], [tg], [st]) VALUES (N's03', N'Mỹ thuật', 120, N'Ngô Thừa Ân', 120)
INSERT [dbo].[Sach1] ([matailieu], [nhaxuatban], [sobanphathanh], [tg], [st]) VALUES (N's04', N'Giáo dục', 150, N'Nguyễn Nhật Ánh', 356)
INSERT [dbo].[Sach1] ([matailieu], [nhaxuatban], [sobanphathanh], [tg], [st]) VALUES (N's05', N'Kim đồng', 20, N'Ngô Thừa Ân', 120)
INSERT [dbo].[Sach1] ([matailieu], [nhaxuatban], [sobanphathanh], [tg], [st]) VALUES (N's06', N'Kim đồng', 120, N'Châu Văn Điệp', 500)
GO
INSERT [dbo].[TapChi] ([matailieu], [nhaxuatban], [sobanphathanh], [sophathanh], [thangphathanh]) VALUES (N'tc01', N'Nhi Đồng', 20, 1, 8)
INSERT [dbo].[TapChi] ([matailieu], [nhaxuatban], [sobanphathanh], [sophathanh], [thangphathanh]) VALUES (N'tc03', N'Kim Đồng', 500, 12, 8)
INSERT [dbo].[TapChi] ([matailieu], [nhaxuatban], [sobanphathanh], [sophathanh], [thangphathanh]) VALUES (N'tc04', N'Hoa học trò', 150, 1, 2)
INSERT [dbo].[TapChi] ([matailieu], [nhaxuatban], [sobanphathanh], [sophathanh], [thangphathanh]) VALUES (N'test', N'test1', 15, 2, 10)
GO
