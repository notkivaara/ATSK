-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 09 Jun 2022 pada 14.06
-- Versi server: 10.4.16-MariaDB
-- Versi PHP: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `toko_sumberkolak`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `akun`
--

CREATE TABLE `akun` (
  `kd_akun` char(6) NOT NULL,
  `nama` varchar(40) NOT NULL,
  `username` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  `role` enum('Owner','Kasir') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `akun`
--

INSERT INTO `akun` (`kd_akun`, `nama`, `username`, `password`, `role`) VALUES
('KA0001', 'Agus Soenarjadi', 'Agus', '123', 'Owner'),
('KA0002', 'Afin', 'Afin', '2003', 'Owner');

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `kd_brg` char(6) NOT NULL,
  `kd_barcode` varchar(16) DEFAULT NULL,
  `nama_brg` varchar(40) NOT NULL,
  `kategori` enum('Alat Mandi','Makanan Ringan','Alat Cuci','Alat Makan','Sembako') NOT NULL,
  `hrg_beli_brg` int(5) NOT NULL,
  `hrg_jual_brg` int(11) NOT NULL,
  `satuan` enum('pcs','pack','1 kg','1/2 kg','1/4 kg','1 ons','1 liter','1/2 liter','1/4 liter','') NOT NULL,
  `stock` int(3) NOT NULL,
  `retur` int(11) DEFAULT NULL,
  `waktu_penambahan` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`kd_brg`, `kd_barcode`, `nama_brg`, `kategori`, `hrg_beli_brg`, `hrg_jual_brg`, `satuan`, `stock`, `retur`, `waktu_penambahan`) VALUES
('AC0014', NULL, 'Sabun Daia', 'Alat Cuci', 90000, 90009, 'pcs', 90, 0, '2022-05-15 10:31:24'),
('AC0015', NULL, 'Bawah', 'Alat Cuci', 20000, 22000, 'pcs', 20, 0, '2022-05-15 10:40:20'),
('AC0016', NULL, 'Kiri', 'Alat Cuci', 2000, 2200, 'pcs', 90, 0, '2022-05-15 10:40:57'),
('AC0017', NULL, 'Kanan', 'Alat Cuci', 2000, 2200, 'pcs', 90, 0, '2022-05-15 10:51:47'),
('AI0015', NULL, 'Garam', 'Sembako', 5000, 5500, 'pcs', 90, 0, '2022-05-06 14:27:26'),
('AI0018', NULL, 'Gayung Dewa', 'Alat Mandi', 10000, 11000, 'pcs', 15, 0, '2022-05-09 04:52:35'),
('AI0019', NULL, 'Sabun', 'Alat Mandi', 3000, 3500, 'pcs', 20, 0, '2022-05-10 14:09:10'),
('AI0020', NULL, 'Taro', 'Alat Mandi', 5000, 5500, 'pack', 90, 0, '2022-05-10 14:11:01'),
('AI0024', '090009092', 'Sabun Lx', 'Alat Mandi', 5000, 5500, 'pcs', 20, 0, '2022-05-23 09:08:37'),
('AM0001', NULL, 'Garpu', 'Alat Makan', 10000, 11000, 'pack', 500, 0, '2022-05-05 13:29:45'),
('coba', NULL, 'coba', 'Makanan Ringan', 5000, 50000, 'pcs', 90, 0, '2022-04-25 04:28:25'),
('MR0001', NULL, 'Chiki', 'Makanan Ringan', 10000, 11000, '1 liter', 500, 0, '2022-05-13 12:57:41'),
('MR0002', NULL, 'UBAH', 'Makanan Ringan', 9000, 9900, '1 kg', 20, 0, '2022-05-17 14:50:06'),
('MR0003', '08099909092', 'Taro', 'Makanan Ringan', 3000, 3500, 'pcs', 20, 0, '2022-05-23 09:09:40'),
('MR0004', '09120391203', 'Oreo', 'Makanan Ringan', 5000, 6000, 'pcs', 90, 0, '2022-06-04 07:19:11'),
('MR0005', '0821020000', 'GORIORIO', 'Makanan Ringan', 5000, 5500, 'pack', 200, 20, '2022-06-04 07:34:29'),
('MR0006', '0291320021', 'Chitato Pedas', 'Makanan Ringan', 9000, 9900, 'pcs', 70, 20, '2022-06-04 07:39:27'),
('SE0001', NULL, 'Gula', 'Sembako', 10000, 11000, '1 kg', 500, 0, '2022-05-13 12:58:21'),
('SE0002', NULL, 'Gula', 'Sembako', 5000, 5500, 'pcs', 20, 0, '2022-05-13 12:58:59'),
('SE0003', NULL, 'betulin', 'Sembako', 50000, 55000, 'pcs', 22, 0, '2022-05-17 14:44:28'),
('SE0004', NULL, 'Kopi', 'Sembako', 20000, 22000, 'pcs', 99, 0, '2022-05-15 10:27:08'),
('SE0005', NULL, 'siapa dah', 'Sembako', 2000, 2500, 'pcs', 1, 0, '2022-05-17 14:44:47'),
('SE0006', NULL, 'Cengkeh', 'Sembako', 2000, 2200, 'pcs', 50, 0, '2022-05-17 13:25:14'),
('SE0007', NULL, 'Coklat', 'Sembako', 500, 500, 'pcs', 10, 0, '2022-05-17 14:14:18'),
('SE0013', '0400021890', 'Kayu Manis', 'Sembako', 50000, 55000, '1/2 kg', 20, 0, '2022-05-21 13:16:26'),
('SE0014', '0042190000', 'Sikat', 'Alat Cuci', 5000, 5500, 'pcs', 20, 0, '2022-05-23 08:43:43'),
('SE0015', '091230012930', 'Chitao Bulgogi', 'Makanan Ringan', 5000, 5500, 'pack', 12, 0, '2022-05-25 06:55:45'),
('SE0016', '90129039888', 'Sabun Cuci Daia', 'Alat Cuci', 5000, 5500, 'pcs', 10, 10, '2022-06-04 08:48:27');

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_transaksi`
--

CREATE TABLE `detail_transaksi` (
  `kd_transaksi` char(16) NOT NULL,
  `kd_brg` char(6) NOT NULL,
  `kuantitas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Trigger `detail_transaksi`
--
DELIMITER $$
CREATE TRIGGER `KURANG_STOK_JUAL` AFTER INSERT ON `detail_transaksi` FOR EACH ROW BEGIN
	UPDATE barang SET stock = stock-NEW.kuantitas
    WHERE barang.kd_brg=NEW.kd_brg;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_transaksi_beli`
--

CREATE TABLE `detail_transaksi_beli` (
  `kd_beli` char(6) NOT NULL,
  `kd_brg` char(6) NOT NULL,
  `kuantitas_beli` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Trigger `detail_transaksi_beli`
--
DELIMITER $$
CREATE TRIGGER `TAMBAH_STOK` AFTER INSERT ON `detail_transaksi_beli` FOR EACH ROW BEGIN
	UPDATE barang SET stock = stock+NEW.kuantitas_beli
    WHERE barang.kd_brg=NEW.kd_brg;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengeluaran`
--

CREATE TABLE `pengeluaran` (
  `kd_pengeluaran` varchar(6) NOT NULL,
  `nama` varchar(16) NOT NULL,
  `tgl_bayar` date NOT NULL,
  `bulan` enum('Januari','Pebruari','Maret','April','Mei','Juni','Juli','Agustus','September','Oktober','November','Desember') NOT NULL,
  `tahun` year(4) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pengeluaran`
--

INSERT INTO `pengeluaran` (`kd_pengeluaran`, `nama`, `tgl_bayar`, `bulan`, `tahun`, `total`) VALUES
('PE0001', 'Parkir', '2022-05-06', 'Maret', 2022, 1000000),
('PE0002', 'Listrik', '2022-05-07', 'Januari', 2022, 100000),
('PE0003', 'Sampah', '2022-05-07', 'Pebruari', 2022, 10000),
('PE0004', 'Listrik', '2022-06-06', 'Januari', 2022, 2000000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `supplier`
--

CREATE TABLE `supplier` (
  `kd_supplier` char(6) NOT NULL,
  `nama` varchar(40) NOT NULL,
  `alamat` text NOT NULL,
  `telp` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `supplier`
--

INSERT INTO `supplier` (`kd_supplier`, `nama`, `alamat`, `telp`) VALUES
('SP0001', 'Ruben Pratama', 'Mangli', '085123456789'),
('SP0002', 'Dwi Susanto', 'Bangsal', '085987654321'),
('SP0003', 'Sriwito', 'Panji', '082333564179');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `kd_transaksi` char(16) NOT NULL,
  `tanggal` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `harga_total` int(7) NOT NULL,
  `tunai` int(7) NOT NULL,
  `kembali` int(7) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`kd_transaksi`, `tanggal`, `harga_total`, `tunai`, `kembali`) VALUES
('TR0001', '2022-06-06 10:51:05', 100000, 120000, 20000),
('TR0005', '2022-06-06 10:50:47', 50000, 60000, 10000);

--
-- Trigger `transaksi`
--
DELIMITER $$
CREATE TRIGGER `KEMBALIAN_JUAL` BEFORE UPDATE ON `transaksi` FOR EACH ROW BEGIN
	SET new.kembali=if(new.tunai > old.harga_total,new.tunai-old.harga_total,0);
    
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi_beli`
--

CREATE TABLE `transaksi_beli` (
  `kd_beli` char(6) NOT NULL,
  `kd_supplier` char(6) NOT NULL,
  `tgl` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `total_harga_beli` int(11) NOT NULL,
  `tunai_beli` int(11) NOT NULL,
  `kembali` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `transaksi_beli`
--

INSERT INTO `transaksi_beli` (`kd_beli`, `kd_supplier`, `tgl`, `total_harga_beli`, `tunai_beli`, `kembali`) VALUES
('TB0001', 'SP0001', '2022-03-19 17:00:00', 30000, 35000, 5000),
('TB0002', 'SP0002', '2022-03-19 17:00:00', 25000, 26000, 1000),
('TB0003', 'SP0002', '2022-04-08 17:00:00', 5000000, 6000000, 1000000),
('TB0005', 'SP0002', '2022-04-08 17:00:00', 5000000, 6000000, 1000000);

--
-- Trigger `transaksi_beli`
--
DELIMITER $$
CREATE TRIGGER `KEMBALIAN_BELI` BEFORE UPDATE ON `transaksi_beli` FOR EACH ROW BEGIN
	SET new.kembali=IF(new.tunai_beli > old.total_harga_beli,new.tunai_beli-old.total_harga_beli,0);
    
END
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`kd_akun`);

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kd_brg`);

--
-- Indeks untuk tabel `detail_transaksi`
--
ALTER TABLE `detail_transaksi`
  ADD KEY `kd_transaksi` (`kd_transaksi`),
  ADD KEY `kd_barang` (`kd_brg`);

--
-- Indeks untuk tabel `detail_transaksi_beli`
--
ALTER TABLE `detail_transaksi_beli`
  ADD KEY `kd_beli` (`kd_beli`),
  ADD KEY `kd_barang` (`kd_brg`);

--
-- Indeks untuk tabel `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`kd_supplier`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`kd_transaksi`);

--
-- Indeks untuk tabel `transaksi_beli`
--
ALTER TABLE `transaksi_beli`
  ADD PRIMARY KEY (`kd_beli`),
  ADD KEY `kd_supplier` (`kd_supplier`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `detail_transaksi`
--
ALTER TABLE `detail_transaksi`
  ADD CONSTRAINT `detail_transaksi_ibfk_2` FOREIGN KEY (`kd_brg`) REFERENCES `barang` (`kd_brg`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detail_transaksi_ibfk_3` FOREIGN KEY (`kd_transaksi`) REFERENCES `transaksi` (`kd_transaksi`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `detail_transaksi_beli`
--
ALTER TABLE `detail_transaksi_beli`
  ADD CONSTRAINT `detail_transaksi_beli_ibfk_1` FOREIGN KEY (`kd_beli`) REFERENCES `transaksi_beli` (`kd_beli`),
  ADD CONSTRAINT `detail_transaksi_beli_ibfk_2` FOREIGN KEY (`kd_brg`) REFERENCES `barang` (`kd_brg`);

--
-- Ketidakleluasaan untuk tabel `transaksi_beli`
--
ALTER TABLE `transaksi_beli`
  ADD CONSTRAINT `transaksi_beli_ibfk_1` FOREIGN KEY (`kd_supplier`) REFERENCES `supplier` (`kd_supplier`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
