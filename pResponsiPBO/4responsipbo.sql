-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 15, 2020 at 01:51 AM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `4responsipbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_daerah`
--

CREATE TABLE `tb_daerah` (
  `id` int(11) NOT NULL,
  `nama` varchar(225) NOT NULL,
  `odp` int(11) NOT NULL,
  `pdp` int(11) NOT NULL,
  `positif` int(11) NOT NULL,
  `status` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_daerah`
--

INSERT INTO `tb_daerah` (`id`, `nama`, `odp`, `pdp`, `positif`, `status`) VALUES
(4, 'yogyakarta', 100, 60, 1, 'Zona Merah'),
(5, 'jakarta', 500, 300, 25, 'Zona Merah'),
(6, 'bali', 74, 30, 0, 'Zona Hijau'),
(7, 'banten', 250, 43, 0, 'Zona Hijau'),
(8, 'bandung', 153, 44, 5, 'Zona Merah'),
(10, 'solo', 76, 43, 0, 'Zona Hijau'),
(11, 'samarinda', 49, 43, 3, 'Zona Merah'),
(12, 'semarang', 321, 66, 0, 'Zona Hijau');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_daerah`
--
ALTER TABLE `tb_daerah`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_daerah`
--
ALTER TABLE `tb_daerah`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
