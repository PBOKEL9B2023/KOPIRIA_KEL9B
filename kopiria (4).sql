-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 21, 2024 at 12:30 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kopiria`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_admin` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `username`, `password`) VALUES
(1, 'dapa', 'admin'),
(2, 'dava', 'admin'),
(3, 'coba', 'admin'),
(4, 'admin', '123');

-- --------------------------------------------------------

--
-- Table structure for table `menukopiria`
--

CREATE TABLE `menukopiria` (
  `id_menukopiria` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `quantity` int(10) NOT NULL,
  `price` int(11) NOT NULL,
  `category` varchar(23) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `menukopiria`
--

INSERT INTO `menukopiria` (`id_menukopiria`, `name`, `quantity`, `price`, `category`) VALUES
(25, 'matcharia coffee', 867, 18000, 'Food'),
(26, 'matcharia choco', 89, 18000, 'noncoffee'),
(27, 'matcharia sweet', 36, 18000, 'noncoffee'),
(28, 'matcharia original', 64, 15000, 'noncoffee'),
(29, 'matcharia hot', 22, 15000, 'noncoffee'),
(30, 'eskopiren', 223, 16000, 'coffee'),
(31, 'eskorimi', 36, 16000, 'coffee'),
(32, 'eskoria', 45, 14000, 'coffee'),
(33, 'eskoritem', 41, 10000, 'coffee'),
(34, 'susuria regal', 60, 18000, 'noncoffee'),
(35, 'susuria oreo', 45, 18000, 'noncoffee'),
(36, 'eskul merona', 69, 16000, 'noncoffee'),
(37, 'eskul apel ijo', 44, 16000, 'noncoffee'),
(38, 'milo cheese', 42, 20000, 'noncoffee'),
(39, 'milo kopi', 64, 20000, 'coffee'),
(40, 'milo dinosaur', 80, 20000, 'NonCoffee'),
(41, 'roti bakar', 65, 13000, 'food'),
(42, 'kentang goreng', 63, 16000, 'food'),
(43, 'singkong goreng', 50, 13000, 'food'),
(44, 'roti telur', 53, 13000, 'Food');

-- --------------------------------------------------------

--
-- Table structure for table `pesanan`
--

CREATE TABLE `pesanan` (
  `id_pesanan` int(11) NOT NULL,
  `pemesan` varchar(40) NOT NULL,
  `name` varchar(40) NOT NULL,
  `quantity` int(11) NOT NULL,
  `size` varchar(10) NOT NULL,
  `orderType` varchar(25) NOT NULL,
  `paymentMethod` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pesanan`
--

INSERT INTO `pesanan` (`id_pesanan`, `pemesan`, `name`, `quantity`, `size`, `orderType`, `paymentMethod`) VALUES
(1, 'Andi Setiawan', 'Kopi Americano', 2, 'Regular', 'Takeaway', 'Tunai'),
(2, 'Budi Santoso', 'Kopi Latte', 1, 'Large', 'Dine In', 'QRIS'),
(3, 'Citra Ayu', 'Kopi Cappuccino', 3, 'Regular', 'Takeaway', 'Tunai'),
(4, 'Dewi Rahayu', 'Kopi Mocha', 2, 'Large', 'Dine In', 'QRIS'),
(5, 'Eko Prasetyo', 'Kopi Espresso', 1, 'Regular', 'Takeaway', 'Tunai'),
(6, 'Fina Lestari', 'Kopi Black', 5, 'Large', 'Dine In', 'QRIS'),
(7, 'Gita Pramesti', 'Kopi Vanilla', 3, 'Regular', 'Takeaway', 'Tunai'),
(8, 'Hendra Gunawan', 'Kopi Hazelnut', 1, 'Large', 'Dine In', 'QRIS'),
(9, 'Indra Wijaya', 'Kopi Cold Brew', 2, 'Regular', 'Takeaway', 'Tunai'),
(10, 'Joni Ardianto', 'Kopi Affogato', 4, 'Large', 'Dine In', 'QRIS'),
(11, 'dada', 'matcharia coffee', 23232, 'Reguler', 'TakeAway', 'QRIS'),
(12, 'dava', 'matcharia coffee', 10, 'Reguler', 'DineIn', 'QRIS'),
(13, 'apapa', 'matcharia choco', 232, 'Reguler', 'DineIn', 'QRIS'),
(14, 'adada', 'matcharia coffee', 102, 'Reguler', 'TakeAway', 'QRIS'),
(15, 'adsa', 'matcharia coffee', 123, 'Reguler', 'TakeAway', 'QRIS'),
(16, 'adasds', 'matcharia coffee', 2323, 'Reguler', 'TakeAway', 'QRIS'),
(17, 'dasdas', 'matcharia coffee', 23, 'Reguler', 'TakeAway', 'Tunai'),
(18, 'asdasd', 'matcharia coffee', 232, 'Reguler', 'TakeAway', 'QRIS'),
(19, 'dasdas', 'matcharia coffee', 645, 'Reguler', 'DineIn', 'QRIS'),
(20, 'hnghrt', 'matcharia coffee', 7878, 'Reguler', 'DineIn', 'QRIS'),
(21, 'fewfwefwe', 'matcharia coffee', 123123, 'Large', 'DineIn', 'Tunai'),
(22, 'dapa', 'matcharia hot', 1, 'Reguler', 'DineIn', 'QRIS'),
(23, 'dapa', 'milo dinosaur', 2, 'Reguler', 'DineIn', 'QRIS'),
(24, 'dapa', 'eskorimi', 3, 'Reguler', 'TakeAway', 'QRIS'),
(25, 'dapa', 'matcharia coffee', 12, 'Reguler', 'TakeAway', 'QRIS'),
(26, 'dada', 'matcharia choco', 14, 'Reguler', 'TakeAway', 'QRIS'),
(27, 'ada', 'matcharia coffee', 63, 'Large', 'DineIn', 'QRIS'),
(28, 'adasds', 'matcharia choco', 49, 'Reguler', 'DineIn', 'QRIS'),
(29, 'adasdas', 'roti telur', 1, 'Reguler', 'TakeAway', 'QRIS'),
(30, 'asdasd', 'matcharia coffee', 232, 'Reguler', 'TakeAway', 'QRIS'),
(31, 'adasdas', 'matcharia coffee', 12, 'Reguler', 'TakeAway', 'QRIS'),
(32, 'aasdsa', 'matcharia original', 1, 'Large', 'DineIn', 'QRIS');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `menukopiria`
--
ALTER TABLE `menukopiria`
  ADD PRIMARY KEY (`id_menukopiria`);

--
-- Indexes for table `pesanan`
--
ALTER TABLE `pesanan`
  ADD PRIMARY KEY (`id_pesanan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `menukopiria`
--
ALTER TABLE `menukopiria`
  MODIFY `id_menukopiria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;

--
-- AUTO_INCREMENT for table `pesanan`
--
ALTER TABLE `pesanan`
  MODIFY `id_pesanan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
