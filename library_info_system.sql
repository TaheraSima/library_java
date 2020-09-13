-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 27, 2016 at 05:11 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library_info_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `book_no` int(50) NOT NULL,
  `book_title` varchar(50) NOT NULL,
  `book_type` varchar(50) NOT NULL,
  `author_name` varchar(50) NOT NULL,
  `quantity` int(20) NOT NULL,
  `date` date NOT NULL,
  `edition` varchar(10) NOT NULL,
  `price` int(255) NOT NULL,
  `shelf_no` int(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`book_no`, `book_title`, `book_type`, `author_name`, `quantity`, `date`, `edition`, `price`, `shelf_no`) VALUES
(1001, 'ami topu', 'small story', 'jafor iqbal', 5, '0000-00-00', '3rd', 200, 3),
(1004, 'Sheser kobita', 'Nobel', 'Robindranath Tagoure', 10, '2016-12-06', '7th', 1000, 1),
(1003, 'Oporajita', 'Small story', 'Bivutibhusun bandopadhay', 9, '2016-12-15', '5th', 200, 2),
(1002, 'Meghnathbodh kabbo', 'Nobel', 'Micheal modhusudan dutta', 10, '2016-12-15', '2nd', 800, 1);

-- --------------------------------------------------------

--
-- Table structure for table `due`
--

CREATE TABLE `due` (
  `c-no` int(10) NOT NULL,
  `b-no` int(10) NOT NULL,
  `b-title` varchar(15) NOT NULL,
  `issue` date NOT NULL,
  `return-date` date NOT NULL,
  `du` date NOT NULL,
  `fine` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `due`
--

INSERT INTO `due` (`c-no`, `b-no`, `b-title`, `issue`, `return-date`, `du`, `fine`) VALUES
(2344, 334, 'asded', '2016-12-07', '2016-12-19', '2016-12-20', 20),
(14103151, 2008, 'edrs', '2016-12-05', '2016-12-08', '2016-12-10', 40);

-- --------------------------------------------------------

--
-- Table structure for table `issue`
--

CREATE TABLE `issue` (
  `serial` int(5) NOT NULL,
  `c_no` int(10) NOT NULL,
  `b_no` varchar(20) NOT NULL,
  `b_title` varchar(50) NOT NULL,
  `quan` int(10) NOT NULL,
  `issue` date NOT NULL,
  `due` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `issue`
--

INSERT INTO `issue` (`serial`, `c_no`, `b_no`, `b_title`, `quan`, `issue`, `due`) VALUES
(1, 14103151, '1001', 'SHESER KOBITA', 1, '2016-12-15', '2016-12-23'),
(2, 14103150, '1002', 'SHESER KOBITA', 1, '2016-12-15', '2016-12-23'),
(3, 14103142, '1003', 'OPORAJITA', 1, '2016-12-15', '2016-12-23');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `user` varchar(50) NOT NULL,
  `pass` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`user`, `pass`) VALUES
('Luminous', '123');

-- --------------------------------------------------------

--
-- Table structure for table `magazine`
--

CREATE TABLE `magazine` (
  `m_no` int(10) NOT NULL,
  `m_name` varchar(20) NOT NULL,
  `m_type` varchar(20) NOT NULL,
  `language` varchar(20) NOT NULL,
  `shelf_no` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `magazine`
--

INSERT INTO `magazine` (`m_no`, `m_name`, `m_type`, `language`, `shelf_no`) VALUES
(1, 'BINODON MULOK', 'Bangla', 'Nobeen', 1),
(2, 'BINODON MULOK', 'Bangla', 'Rosh Alo', 2),
(3, 'ROHOSSHO POTRIKA', 'Bangla', 'Shongshoptok', 3),
(4, 'BINODON MULOK', 'Bangla', 'Comics', 2);

-- --------------------------------------------------------

--
-- Table structure for table `news`
--

CREATE TABLE `news` (
  `p_name` varchar(15) NOT NULL,
  `date` date NOT NULL,
  `shelf_no` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `news`
--

INSERT INTO `news` (`p_name`, `date`, `shelf_no`) VALUES
('Daily NewsPaper', '2016-12-16', 4),
('The Independent', '2016-12-15', 3),
('Doinic Inqilab', '2016-12-16', 3),
('The Daily Star ', '2016-12-16', 3);

-- --------------------------------------------------------

--
-- Table structure for table `s_reg`
--

CREATE TABLE `s_reg` (
  `c_no` int(8) NOT NULL,
  `s_name` varchar(20) NOT NULL,
  `class` varchar(20) NOT NULL,
  `roll` int(10) NOT NULL,
  `c_teacher_name` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `s_reg`
--

INSERT INTO `s_reg` (`c_no`, `s_name`, `class`, `roll`, `c_teacher_name`, `address`) VALUES
(14203141, 'Farjana islam', 'Class 1', 1, 'Rehan Uddin', 'Kamarpara,turag,dhaka'),
(14103151, 'Tahera sheema', 'Class 5', 1, 'Shirin Parvin', 'Uttara,dhaka'),
(14103142, 'Nusrat Yesmin Reya', 'Class 5', 2, 'Shirin Parvin', 'Uttara,dhaka'),
(14103132, 'Diba sultana Anila', 'Class 4', 3, 'Shamsul Haque', 'Tongi, Gazipur');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `due`
--
ALTER TABLE `due`
  ADD PRIMARY KEY (`c-no`);

--
-- Indexes for table `issue`
--
ALTER TABLE `issue`
  ADD PRIMARY KEY (`serial`);

--
-- Indexes for table `magazine`
--
ALTER TABLE `magazine`
  ADD PRIMARY KEY (`m_no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `issue`
--
ALTER TABLE `issue`
  MODIFY `serial` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
