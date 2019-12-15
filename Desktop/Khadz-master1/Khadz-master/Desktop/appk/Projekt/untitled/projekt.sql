-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 13 Gru 2019, 19:46
-- Wersja serwera: 10.4.8-MariaDB
-- Wersja PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `projekt`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `gr_dziekan`
--

CREATE TABLE `gr_dziekan` (
  `id_grupy` int(11) NOT NULL,
  `numer_grupy` decimal(2,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `gr_dziekan`
--

INSERT INTO `gr_dziekan` (`id_grupy`, `numer_grupy`) VALUES
(1, '1'),
(2, '2'),
(3, '3'),
(4, '4');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `katedra`
--

CREATE TABLE `katedra` (
  `id_katedry` int(11) NOT NULL,
  `id_wydzial` int(11) DEFAULT NULL,
  `nazwa_katedry` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `katedra`
--

INSERT INTO `katedra` (`id_katedry`, `id_wydzial`, `nazwa_katedry`) VALUES
(1, 1, 'Katedra Inżynierii Komputerowe'),
(2, 2, 'Katedra Elektroniki (KE)'),
(3, 1, 'Katedra Systemów Cyfrowych'),
(4, 1, 'Katedra Podstaw Informatyki ');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `kierunek`
--

CREATE TABLE `kierunek` (
  `id_kierunek` int(11) NOT NULL,
  `id_wydzial` int(11) DEFAULT NULL,
  `nazwa_kierunku` varchar(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `kierunek`
--

INSERT INTO `kierunek` (`id_kierunek`, `id_wydzial`, `nazwa_kierunku`) VALUES
(1, 1, 'Informatyka'),
(2, 2, 'Elektronika i Automatyka');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `plan`
--

CREATE TABLE `plan` (
  `Id_przedmiot` int(11) NOT NULL,
  `id_prowadzacy` int(11) NOT NULL,
  `id_specjalnosc` int(11) NOT NULL,
  `id_grupy` int(11) NOT NULL,
  `id_semestr` int(11) NOT NULL,
  `Id_tryb` int(11) NOT NULL,
  `id_kierunek` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `plan`
--

INSERT INTO `plan` (`Id_przedmiot`, `id_prowadzacy`, `id_specjalnosc`, `id_grupy`, `id_semestr`, `Id_tryb`, `id_kierunek`) VALUES
(1, 1, 0, 1, 1, 1, 1),
(2, 2, 0, 1, 1, 1, 1),
(2, 3, 0, 2, 1, 1, 1),
(2, 3, 0, 3, 1, 1, 1),
(2, 10, 0, 4, 1, 1, 1),
(3, 4, 0, 1, 1, 1, 1),
(3, 4, 0, 4, 1, 1, 1),
(3, 5, 0, 2, 1, 1, 1),
(3, 5, 0, 3, 1, 1, 1),
(4, 6, 0, 1, 2, 1, 1),
(4, 6, 0, 2, 2, 1, 1),
(4, 7, 0, 3, 2, 1, 1),
(4, 8, 0, 4, 2, 1, 1),
(5, 8, 0, 1, 2, 1, 1),
(5, 9, 0, 2, 2, 1, 1),
(5, 9, 0, 3, 2, 1, 1),
(5, 9, 0, 4, 2, 1, 1),
(6, 10, 0, 1, 3, 1, 1),
(6, 10, 0, 2, 3, 1, 1),
(6, 11, 0, 3, 3, 1, 1),
(6, 11, 0, 4, 3, 1, 1),
(7, 12, 0, 1, 3, 1, 1),
(7, 12, 0, 2, 3, 1, 1),
(7, 13, 0, 3, 3, 1, 1),
(7, 13, 0, 4, 3, 1, 1),
(8, 14, 0, 1, 4, 1, 1),
(8, 14, 0, 2, 4, 1, 1),
(8, 15, 0, 3, 4, 1, 1),
(8, 15, 0, 4, 4, 1, 1),
(9, 16, 0, 1, 4, 1, 1),
(9, 16, 0, 2, 4, 1, 1),
(9, 17, 0, 3, 4, 1, 1),
(9, 18, 0, 4, 4, 1, 1),
(10, 16, 1, 1, 5, 1, 1),
(10, 16, 2, 2, 5, 1, 1),
(10, 17, 2, 3, 5, 1, 1),
(10, 18, 3, 4, 5, 1, 1),
(11, 16, 1, 1, 5, 1, 1),
(11, 16, 2, 2, 5, 1, 1),
(11, 17, 2, 3, 5, 1, 1),
(11, 18, 3, 4, 5, 1, 1),
(12, 19, 1, 1, 6, 1, 1),
(12, 19, 2, 2, 6, 1, 1),
(12, 20, 2, 3, 6, 1, 1),
(12, 20, 3, 4, 6, 1, 1),
(13, 21, 1, 1, 6, 1, 1),
(13, 21, 2, 2, 6, 1, 1),
(13, 22, 2, 3, 6, 1, 1),
(13, 22, 3, 4, 6, 1, 1),
(14, 23, 1, 1, 7, 1, 1),
(14, 23, 2, 2, 7, 1, 1),
(14, 24, 2, 3, 7, 1, 1),
(14, 24, 3, 4, 7, 1, 1),
(15, 18, 3, 2, 7, 1, 1),
(15, 25, 1, 1, 7, 1, 1),
(15, 26, 2, 2, 7, 1, 1),
(15, 27, 2, 3, 7, 1, 1),
(16, 19, 0, 1, 1, 2, 1),
(16, 19, 0, 2, 1, 2, 1),
(16, 20, 0, 3, 1, 2, 1),
(16, 20, 0, 4, 1, 2, 1),
(17, 29, 2, 3, 2, 2, 1),
(17, 35, 1, 1, 2, 2, 1),
(17, 35, 2, 2, 2, 2, 1),
(17, 36, 3, 4, 2, 2, 1),
(18, 30, 1, 1, 2, 2, 1),
(18, 37, 2, 2, 2, 2, 1),
(18, 38, 2, 3, 2, 2, 1),
(18, 38, 3, 4, 2, 2, 1),
(19, 39, 1, 1, 3, 2, 1),
(19, 39, 2, 2, 3, 2, 1),
(19, 43, 2, 3, 3, 2, 1),
(20, 39, 1, 2, 3, 2, 1),
(20, 39, 3, 1, 3, 2, 1),
(20, 43, 2, 3, 3, 2, 1),
(20, 44, 2, 4, 3, 2, 1),
(21, 2, 1, 1, 1, 1, 1),
(21, 3, 1, 4, 1, 1, 1),
(22, 4, 1, 1, 1, 1, 1),
(22, 4, 1, 4, 1, 1, 1),
(22, 5, 1, 2, 1, 1, 1),
(22, 5, 1, 3, 1, 1, 1),
(23, 6, 1, 1, 2, 1, 1),
(23, 6, 1, 2, 2, 1, 1),
(27, 15, 1, 4, 4, 1, 1),
(28, 16, 3, 1, 4, 1, 1),
(28, 16, 3, 2, 4, 1, 1),
(28, 17, 5, 3, 4, 1, 1),
(28, 18, 1, 4, 4, 1, 1),
(29, 16, 2, 1, 5, 1, 1),
(29, 16, 2, 2, 5, 1, 1),
(29, 17, 2, 3, 5, 1, 1),
(29, 18, 3, 4, 5, 1, 1),
(30, 16, 1, 1, 5, 1, 1),
(30, 16, 2, 2, 5, 1, 1),
(30, 17, 2, 3, 5, 1, 1),
(30, 18, 3, 4, 5, 1, 1),
(31, 19, 1, 1, 6, 1, 1),
(31, 19, 2, 2, 6, 1, 1),
(31, 20, 2, 3, 6, 1, 1),
(31, 20, 3, 4, 6, 1, 1),
(32, 21, 1, 1, 6, 1, 1),
(32, 21, 2, 2, 6, 1, 1),
(32, 22, 2, 3, 6, 1, 1),
(32, 22, 3, 4, 6, 1, 1),
(33, 23, 1, 1, 7, 1, 1),
(33, 23, 2, 2, 7, 1, 1),
(33, 24, 2, 3, 7, 1, 1),
(33, 24, 3, 4, 7, 1, 1),
(34, 25, 1, 1, 7, 1, 1),
(34, 26, 2, 2, 7, 1, 1),
(34, 27, 2, 3, 7, 1, 1),
(34, 27, 2, 4, 7, 1, 1),
(35, 25, 3, 1, 7, 1, 1),
(35, 26, 1, 2, 7, 1, 1),
(35, 27, 2, 3, 7, 1, 1),
(35, 28, 3, 4, 7, 1, 1),
(35, 33, 3, 4, 7, 1, 1),
(35, 41, 2, 2, 7, 1, 1),
(35, 41, 3, 4, 7, 1, 1),
(35, 42, 1, 1, 7, 1, 1),
(35, 42, 2, 3, 7, 1, 1),
(36, 19, 0, 1, 1, 2, 1),
(36, 19, 0, 2, 1, 2, 1),
(36, 20, 0, 3, 1, 2, 1),
(36, 20, 0, 4, 1, 2, 1),
(37, 30, 1, 1, 7, 1, 1),
(37, 31, 2, 2, 7, 1, 1),
(37, 32, 2, 3, 7, 1, 1),
(37, 33, 3, 4, 7, 1, 1),
(38, 41, 2, 2, 7, 1, 1),
(38, 41, 3, 4, 7, 1, 1),
(38, 42, 1, 1, 7, 1, 1),
(38, 42, 2, 3, 7, 1, 1),
(39, 42, 1, 1, 7, 1, 1),
(39, 42, 2, 2, 7, 1, 1),
(39, 43, 2, 3, 7, 1, 1),
(39, 43, 3, 4, 7, 1, 1),
(40, 29, 2, 3, 2, 2, 1),
(40, 35, 1, 1, 2, 2, 1),
(40, 35, 2, 2, 2, 2, 1),
(40, 36, 3, 4, 2, 2, 1),
(41, 42, 1, 1, 7, 1, 1),
(41, 42, 2, 2, 7, 1, 1),
(41, 43, 2, 3, 7, 1, 1),
(41, 43, 3, 4, 7, 1, 1);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `prowadzacy`
--

CREATE TABLE `prowadzacy` (
  `id_prowadzacy` int(11) NOT NULL,
  `Id_tytul` int(11) DEFAULT NULL,
  `id_katedry` int(11) DEFAULT NULL,
  `imie_prowadzacy` varchar(30) DEFAULT NULL,
  `nazwisko_prowadzacy` varchar(30) DEFAULT NULL,
  `data_urodzenia_prowadzacy` date DEFAULT NULL,
  `pensja` decimal(5,0) DEFAULT NULL,
  `ilosc_dzieci` decimal(2,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `prowadzacy`
--

INSERT INTO `prowadzacy` (`id_prowadzacy`, `Id_tytul`, `id_katedry`, `imie_prowadzacy`, `nazwisko_prowadzacy`, `data_urodzenia_prowadzacy`, `pensja`, `ilosc_dzieci`) VALUES
(1, 3, 1, 'Marian', 'Słowik', '1980-02-03', '8000', '2'),
(2, 5, 1, 'Jan', 'Wiliński', '1969-01-01', '9500', '1'),
(3, 3, 1, 'Robert', 'Budzisz', '1969-03-02', '8000', '0'),
(4, 2, 1, 'Piotr', 'Arsoba', '1975-05-23', '6500', '0'),
(5, 2, 1, 'Marek', 'Berezowski', '1978-10-12', '6900', '4'),
(6, 2, 1, 'Joanna', 'Rajewska', '1983-12-12', '6750', '2'),
(7, 1, 1, 'Robert', 'Bernartowicz', '1980-01-01', '4500', '2'),
(8, 1, 1, 'Jan', 'Rodzyn', '1990-09-23', '4500', '0'),
(9, 1, 1, 'Arkadiusz', 'Wyka', '1989-01-23', '6000', '2'),
(10, 2, 1, 'Krzysztof', 'Peta', '1975-10-01', '5000', '2'),
(11, 1, 1, 'Bogdan', 'Wasik', '1972-08-15', '5550', '0'),
(12, 2, 1, 'Daniel', 'Pieniak', '1985-06-18', '6700', '0'),
(13, 4, 2, 'Marian', 'Drabarek', '1962-10-12', '8000', '2'),
(14, 5, 2, 'Józef', 'Wawryn', '1969-01-08', '9000', '4'),
(15, 1, 2, 'Patryk', 'Rubanowicz', '1979-04-27', '5550', '3'),
(16, 3, 2, 'Daniel', 'Gretkowski', '1963-12-12', '6000', '4'),
(17, 1, 2, 'Paweł', 'Widuliński', '1984-07-02', '5500', '0'),
(18, 1, 2, 'Bogdan', 'Jasiulewicz', '1969-05-30', '6000', '2'),
(19, 4, 2, 'Wojtek', 'Mostkowiak', '1964-10-09', '8000', '3'),
(20, 2, 2, 'Michał', 'Bilski', '1980-12-20', '7000', '1'),
(21, 1, 1, 'Grzegorz', 'Babik', '1995-12-12', '4500', '0'),
(22, 1, 2, 'Patryk', 'Lubiński', '1994-02-25', '4000', '0'),
(23, 2, 1, 'Mirosław', 'Bursztyn', '1960-05-09', '7000', '0'),
(24, 2, 2, 'Witold', 'Długosz', '1981-05-02', '6700', '5'),
(25, 3, 1, 'Dariusz', 'Rozenek', '1970-12-01', '7900', '2'),
(26, 3, 2, 'Łukasz', 'Banek', '1975-05-09', '7500', '0'),
(27, 4, 1, 'Jarosław', 'Bis', '1968-06-28', '7500', '2'),
(28, 4, 2, 'Jarosław', 'Tkaczyk', '1972-05-05', '6000', '0'),
(29, 5, 1, 'Jurek', 'Orban', '1949-05-29', '9500', '5'),
(30, 5, 2, 'Piotr', 'Włosik', '1953-11-30', '9200', '3'),
(31, 1, 3, 'Mateusz', 'Chrończyk', '1990-02-03', '5000', '1'),
(32, 1, 3, 'Witold', 'Tkaczyk', '1994-02-25', '4500', '1'),
(33, 2, 3, 'Bogdan', 'Boryn', '1993-08-15', '5550', '1'),
(34, 2, 3, 'Maria', 'Tren', '1985-06-18', '6700', '0'),
(35, 2, 3, 'Paweł', 'Trąba', '1984-07-02', '5500', '3'),
(36, 2, 3, 'Mariusz', 'Wyka', '1990-09-03', '6500', '2'),
(37, 2, 3, 'Wojciech', 'Rob', '1989-09-09', '7600', '2'),
(38, 3, 3, 'Michał', 'Byrek', '1976-02-20', '7000', '3'),
(39, 3, 3, 'Katarzyna', 'Waczlyk', '1979-07-30', '7500', '1'),
(40, 3, 3, 'Marcin', 'Wójcik', '1976-01-10', '7500', '2'),
(41, 4, 3, 'Robert', 'Góral', '1965-09-23', '8000', '3'),
(42, 4, 3, 'Wladek', 'Tkaczyk', '1969-01-01', '800', '0'),
(43, 5, 3, 'Patryk', 'Wasik', '1949-04-27', '9000', '5'),
(44, 5, 3, 'Zenon', 'Salicki', '1955-05-10', '9990', '2'),
(45, 5, 3, 'Paweł', 'Śluzarczyk', '1968-12-12', '8990', '1'),
(46, 1, 4, 'Bogdan', 'Wójcik', '1978-04-10', '7500', '1'),
(47, 1, 4, 'Renata', 'Świercz', '1987-06-06', '6700', '2'),
(48, 1, 4, 'Arkadiusz', 'Bilski', '1980-12-20', '5000', '1'),
(49, 2, 4, 'Grzegorz', 'Boćwiak', '1970-01-01', '6500', '2'),
(50, 2, 4, 'Janusz', 'Krakowski', '1972-12-23', '7000', '2'),
(51, 2, 4, 'Maria', 'Bis', '1969-03-26', '7000', '2'),
(52, 2, 4, 'Janusz', 'Nowak', '1975-07-23', '7000', '4'),
(53, 2, 4, 'Bogdan', 'Wasik', '1979-02-14', '6900', '2'),
(54, 3, 4, 'Daniel', 'Pieniak', '1967-10-12', '8000', '3'),
(55, 3, 4, 'Paweł', 'Suseł', '1974-07-02', '7500', '0'),
(56, 3, 4, 'Bogdan', 'Klimczak', '1967-09-30', '8000', '2'),
(57, 4, 4, 'Wojciech', 'Szuryn', '1964-10-09', '8500', '1'),
(58, 4, 4, 'Michał', 'Świtek', '1960-12-20', '8400', '0'),
(59, 5, 4, 'Zbigniew', 'Suszyński', '1959-04-29', '9000', '3'),
(60, 5, 4, 'Wacław', 'Wójcik', '1945-02-10', '9500', '3'),
(61, 4, 4, 'Maciej', 'Kozioł', '1961-02-05', '8000', '4'),
(62, 5, 4, 'Kazimierz', 'Wójcik', '1942-02-10', '9800', '6');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `przedmioty`
--

CREATE TABLE `przedmioty` (
  `Id_przedmiot` int(11) NOT NULL,
  `id_typ_zajec` int(11) DEFAULT NULL,
  `nazwa_przedmiotu` varchar(30) DEFAULT NULL,
  `ects` decimal(2,0) DEFAULT NULL,
  `godziny` decimal(3,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `przedmioty`
--

INSERT INTO `przedmioty` (`Id_przedmiot`, `id_typ_zajec`, `nazwa_przedmiotu`, `ects`, `godziny`) VALUES
(1, 1, 'Podstawy analizy matematycznej', '4', '30'),
(2, 1, 'Analiza matematyczna i algebra', '4', '30'),
(3, 1, 'Podstawy miernictwa', '1', '30'),
(4, 1, 'Technika cyfrowa', '3', '30'),
(5, 1, 'Teoretyczne podstawy informaty', '2', '30'),
(6, 1, 'Metody numeryczne', '3', '30'),
(7, 1, 'Podstawy programowania', '2', '30'),
(8, 1, 'Projektowanie aplikacji', '6', '30'),
(9, 1, 'Inteligencja obliczeniowa', '1', '30'),
(10, 1, 'Urządzenia zewnętrzne', '4', '30'),
(11, 2, 'Inteligencja obliczeniowa', '3', '30'),
(12, 2, 'Inżynieria oprogramowania', '2', '30'),
(13, 2, 'Metajęzyki', '1', '30'),
(14, 2, 'Algorytmy i złożoność obliczen', '3', '30'),
(15, 2, 'Architektura systemów ', '3', '30'),
(16, 2, 'Podstawy systemów cyfrowych', '3', '30'),
(17, 2, 'Grafika i komunikacja człowiek', '3', '30'),
(18, 2, 'Bazy danych', '1', '30'),
(19, 2, 'Zarządzanie operacjami ', '3', '30'),
(20, 2, 'Mikroprocesory i systemy ', '3', '30'),
(21, 3, 'Metody numeryczne', '3', '30'),
(22, 3, 'Laboratorium architektury syst', '4', '30'),
(23, 3, ' Laboratorium systemów cyfrowy', '4', '30'),
(24, 3, 'Laboratorium podstaw elektroni', '3', '30'),
(25, 3, 'Laboratorium podstaw miernictw', '2', '30'),
(26, 3, 'Laboratorium techniki mikropro', '2', '30'),
(27, 3, 'Laboratorium urządzeń zewnętrz', '4', '30'),
(28, 3, 'Systemy operacyjne ', '4', '30'),
(29, 3, 'Zastosowania prog. obiektowego', '5', '30'),
(30, 3, 'Systemy zarządzania rel. bazam', '3', '30'),
(31, 4, 'Projektowanie sieci komputerow', '3', '30'),
(32, 4, 'Zastosowania prog. obiektowego', '3', '30'),
(33, 4, 'Projektowanie interfejsów', '2', '30'),
(34, 4, 'Projektowanie aplikacji bazoda', '4', '30'),
(35, 4, 'Projekt dyplomowy inżynierski ', '4', '30'),
(36, 4, 'Zastosowania sztucznej intelig', '1', '30'),
(37, 4, 'Programowanie komponentowe ', '3', '30'),
(38, 4, 'Programowanie komputerów', '4', '30'),
(39, 4, 'Programowanie Robotów', '1', '30'),
(40, 4, 'Projektowanie systemów', '3', '30'),
(41, 5, 'Praktyki zawodowe', '10', '150');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `semestr`
--

CREATE TABLE `semestr` (
  `id_semestr` int(11) NOT NULL,
  `numer_sem` decimal(2,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `semestr`
--

INSERT INTO `semestr` (`id_semestr`, `numer_sem`) VALUES
(1, '1'),
(2, '2'),
(3, '3'),
(4, '4'),
(5, '5'),
(6, '6'),
(7, '7'),
(8, '8'),
(9, '9'),
(10, '10');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `specjalnosc`
--

CREATE TABLE `specjalnosc` (
  `id_specjalnosc` int(11) NOT NULL,
  `nazwa_specjalnosc` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `specjalnosc`
--

INSERT INTO `specjalnosc` (`id_specjalnosc`, `nazwa_specjalnosc`) VALUES
(0, 'brak'),
(1, 'Programowanie komputerów'),
(2, 'Aplikacje mobilne'),
(3, 'Inżynier oprogramowania'),
(5, 'Automatyka');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `studenci`
--

CREATE TABLE `studenci` (
  `Id_student` int(11) NOT NULL,
  `id_specjalnosc` int(11) DEFAULT NULL,
  `Id_tryb` int(11) DEFAULT NULL,
  `id_kierunek` int(11) DEFAULT NULL,
  `id_semestr` int(11) DEFAULT NULL,
  `id_grupy` int(11) DEFAULT NULL,
  `nr_albumu` decimal(6,0) DEFAULT NULL,
  `imie_studenta` varchar(30) DEFAULT NULL,
  `nazwisko_studenta` varchar(30) DEFAULT NULL,
  `data_urodzenia_student` date DEFAULT NULL,
  `pesel_student` decimal(11,0) DEFAULT NULL,
  `stypendium` decimal(4,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `studenci`
--

INSERT INTO `studenci` (`Id_student`, `id_specjalnosc`, `Id_tryb`, `id_kierunek`, `id_semestr`, `id_grupy`, `nr_albumu`, `imie_studenta`, `nazwisko_studenta`, `data_urodzenia_student`, `pesel_student`, `stypendium`) VALUES
(1, 0, 1, 1, 1, 1, '1304', 'Radosław', 'Kowalczyk', '2000-06-25', '93032355776', '250'),
(2, 0, 1, 1, 1, 1, '1302', 'Martyn', 'Ostrowski', '1993-07-08', '98062019096', '0'),
(3, 0, 1, 2, 1, 1, '1303', 'Jarosława', 'Grabowska', '1993-09-01', '95040447809', '0'),
(4, 0, 1, 1, 1, 1, '1305', 'Rościsława', 'Woźniak', '1998-02-23', '89112997462', '0'),
(5, 0, 1, 1, 1, 2, '1306', 'Aleš', 'Nowakowski', '1991-04-02', '99073068431', '0'),
(6, 0, 1, 1, 1, 2, '1307', 'Lidia', 'Kowalczyk', '1993-02-12', '89041070160', '0'),
(7, 0, 1, 2, 1, 2, '1308', 'Cecylia', 'Król', '1998-04-06', '91032838460', '0'),
(8, 0, 1, 1, 1, 2, '1309', 'Przemysł', 'Dąbrowski ', '1995-09-10', '94030956532', '0'),
(9, 0, 1, 1, 1, 2, '1310', 'Bolesław', 'Pawłowski', '1995-02-17', '97122309676', '0'),
(10, 0, 1, 1, 1, 3, '1308', 'Jędrzej', 'Duda', '1998-01-04', '91082864354', '0'),
(11, 0, 1, 1, 1, 3, '1393', 'Donat', 'Jasiński', '1997-08-18', '94090567152', '0'),
(12, 0, 1, 1, 1, 3, '1390', 'Juliusz', 'Czerwinski', '1997-10-03', '211727671', '0'),
(13, 0, 1, 1, 1, 3, '1373', 'Renard', 'Adamski', '1995-11-08', '260309712', '0'),
(14, 0, 1, 2, 1, 3, '1331', 'Patryk', 'Adamski', '1997-01-12', '89121697296', '0'),
(15, 0, 1, 1, 1, 4, '1419', 'Bazyli', 'Adamski', '1995-08-25', '98080734014', '0'),
(16, 0, 1, 1, 1, 4, '1367', 'Berta', 'Tomaszewska', '1999-08-31', '99012714108', '0'),
(17, 0, 1, 1, 1, 4, '1318', 'Eligiusz', 'Adamczyk', '1999-04-26', '97102536933', '0'),
(18, 0, 1, 2, 1, 4, '1368', 'Cyryl', 'Kamiński', '1997-03-05', '96092974039', '0'),
(19, 0, 1, 1, 1, 4, '1400', 'Walentyna', 'Adamczyk', '1992-01-08', '270748545', '0'),
(20, 0, 1, 1, 2, 1, '1358', 'Hendrych', 'Wiśniewski', '1995-04-16', '97110222853', '0'),
(21, 0, 1, 1, 2, 3, '1354', 'Aleksy', 'Kucharski', '2000-03-08', '90070857754', '0'),
(22, 0, 1, 2, 2, 4, '1404', 'Szczeosny', 'Nowakowski', '1995-04-06', '262019514', '0'),
(23, 0, 1, 1, 2, 4, '1394', 'Bolesław', 'Adamczyk', '1991-12-09', '261287518', '0'),
(24, 0, 1, 1, 2, 4, '1410', 'Ksawery', 'Symanski', '1996-01-18', '92112073858', '0'),
(25, 0, 1, 1, 2, 4, '1412', 'Roksana', 'Piotrowska', '1998-09-18', '88121544966', '0'),
(26, 0, 1, 2, 2, 4, '1383', 'Bonifacy', 'Kaczmarek', '1993-07-02', '89050121196', '0'),
(27, 0, 1, 1, 3, 1, '1389', 'Przemysław', 'Gorski', '2000-02-15', '90020753499', '0'),
(28, 0, 1, 1, 3, 1, '1322', 'Wit', 'Wojciechowski', '1994-03-18', '96070695097', '0'),
(29, 0, 1, 2, 3, 1, '1380', 'Martyn', 'Kowalczyk', '1996-11-17', '98062019096', '0'),
(30, 0, 1, 1, 3, 1, '1337', 'Radosław', 'Ostrowski', '1997-05-19', '98062019096', '0'),
(31, 0, 1, 1, 3, 1, '1387', 'Jarosława', 'Grabowska', '1994-09-14', '95040447809', '0'),
(32, 0, 1, 1, 3, 1, '1391', 'Radosław', 'Kowalczyk', '1993-05-03', '93032355776', '0'),
(33, 0, 1, 2, 3, 1, '1340', 'Mikolaj', 'Kucharski', '1995-07-11', '93082243670', '0'),
(34, 0, 1, 1, 3, 2, '1397', 'Aleš', 'Walczak', '1996-06-27', '92082634716', '0'),
(35, 0, 1, 1, 3, 2, '1363', 'Walery', 'Olszewski', '1996-04-24', '99060434858', '0'),
(36, 0, 1, 2, 3, 2, '1378', 'Julek', 'Tomaszewski', '1998-08-06', '90080743331', '0'),
(37, 0, 1, 1, 3, 2, '1402', 'Lesław', 'Pawłowski', '1991-11-18', '93101030270', '0'),
(38, 0, 1, 1, 3, 2, '1335', 'Kuba', 'Pawłowski', '1998-10-10', '95110702230', '0'),
(40, 0, 1, 2, 3, 3, '1348', 'Tekla', 'Symanska', '2000-02-17', '91020141864', '0'),
(41, 0, 1, 1, 3, 3, '1366', 'Feliks', 'Kaczmarek', '1999-08-31', '91100822456', '0'),
(42, 0, 1, 1, 3, 3, '1347', 'Walenty', 'Dudek', '2000-06-25', '92111721455', '0'),
(43, 0, 1, 1, 3, 3, '1301', 'Bogusława', 'Woźniak', '1993-07-08', '94072444848', '0'),
(44, 0, 1, 1, 3, 3, '1313', 'Ferdynand', 'Zając', '1993-09-01', '99031854476', '0'),
(45, 0, 1, 2, 3, 4, '1370', 'Klemens', 'Zając', '1998-02-23', '93012667992', '0'),
(46, 0, 1, 1, 3, 4, '1413', 'Hipolit', 'Nowicki', '1991-04-02', '94100848398', '0'),
(47, 0, 1, 1, 3, 4, '1303', 'Kazia', 'Chmielewska', '1993-02-12', '93122226469', '0'),
(48, 0, 1, 1, 3, 4, '1398', 'Narcyz', 'Gorski', '1998-04-06', '94011930292', '0'),
(49, 0, 1, 1, 4, 1, '1388', 'Bonifacy', 'Król', '1995-09-10', '92113077592', '0'),
(50, 0, 1, 1, 4, 1, '1360', 'Nikifor', 'Majewski', '1995-02-17', '90111626817', '0'),
(51, 0, 1, 2, 4, 1, '1381', 'Adelajda', 'Adamczyk', '1998-01-04', '96031658963', '0'),
(52, 0, 1, 1, 4, 1, '1411', 'Bogusława', 'Maciejewska', '1997-08-18', '96112057106', '0'),
(53, 0, 1, 1, 4, 1, '1320', 'Frydryk', 'Maciejewski', '1997-10-03', '91123125015', '0'),
(54, 0, 1, 1, 4, 1, '1338', 'Lechosław', 'Ostrowski', '1995-11-08', '91111043174', '0'),
(55, 0, 1, 2, 4, 1, '1315', 'Szczęsny', 'Sawicki', '1997-01-12', '93111733617', '0'),
(56, 0, 1, 1, 4, 2, '1415', 'Lew', 'Czerwinski', '1995-08-25', '99112656238', '0'),
(57, 0, 1, 1, 4, 2, '1349', 'Malina', 'Maciejewska', '1999-08-31', '96022731163', '0'),
(58, 0, 1, 1, 4, 2, '1304', 'Frydrych', 'Michalski', '1999-04-26', '91031991711', '0'),
(59, 0, 1, 1, 4, 2, '1369', 'Włodzisław', 'Dąbrowski ', '1997-03-05', '92111781095', '0'),
(60, 0, 1, 2, 4, 2, '1350', 'Halina', 'Kalinowska', '1997-12-12', '93052320149', '0'),
(61, 0, 1, 1, 4, 3, '1314', 'Cezar', 'Zielinski', '1995-04-16', '97032437173', '0'),
(62, 0, 1, 1, 4, 3, '1420', 'Bartosz', 'Szczepański', '2000-03-08', '97120968271', '0'),
(63, 0, 1, 2, 4, 3, '1311', 'Jerzy', 'Duda', '1995-04-06', '89042094251', '250'),
(64, 0, 1, 2, 4, 3, '1408', 'Bogusława', 'Wojciechowska', '1991-12-09', '90010970945', '250'),
(65, 0, 1, 1, 4, 3, '1416', 'Gabrjel', 'Nowicki', '1996-01-18', '90032254111', '0'),
(66, 0, 1, 1, 4, 4, '1375', 'Gertruda', 'Wysocka', '1998-09-18', '94072435044', '0'),
(67, 0, 1, 2, 4, 4, '1356', 'Tadzio', 'Kozłowski', '1993-07-02', '89020874374', '0'),
(68, 0, 1, 2, 4, 4, '1377', 'Maurycy', 'Kwiatkowski', '2000-02-15', '93072284474', '0'),
(69, 0, 1, 1, 4, 4, '1376', 'Frydrych', 'Kalinowski', '1994-03-18', '272120899', '0'),
(70, 0, 1, 1, 5, 1, '1323', 'Maciej', 'Zielinski', '1996-11-17', '99100490774', '0'),
(71, 1, 1, 1, 5, 1, '1414', 'Adrianna', 'Jaworska', '1997-05-19', '89082917943', '0'),
(72, 5, 1, 2, 5, 1, '1326', 'Rościsława', 'Adamska', '1994-09-14', '231740146', '0'),
(73, 1, 1, 1, 5, 1, '1403', 'Jaropełk', 'Adamski', '1993-05-03', '94012194518', '500'),
(74, 1, 1, 1, 5, 1, '1371', 'Lechosław', 'Zawadzki', '1995-07-11', '97091443896', '250'),
(75, 5, 1, 2, 5, 1, '1310', 'Krystyn', 'Ostrowski', '1996-06-27', '90050620974', '0'),
(76, 5, 1, 2, 5, 1, '1321', 'Bartłomiej', 'Chmielewski', '1997-12-12', '98010530651', '0'),
(77, 2, 1, 1, 5, 2, '1406', 'Henio', 'Pawlak', '1996-04-24', '97070292031', '0'),
(78, 5, 1, 2, 5, 2, '1353', 'Sławomir', 'Wiśniewski', '1998-08-06', '99072038037', '0'),
(79, 2, 1, 1, 5, 2, '1384', 'Henryk', 'Borkowski', '1991-11-18', '94121218732', '0'),
(80, 2, 1, 1, 5, 2, '1305', 'Antoni', 'Tomaszewski', '1998-10-10', '96030612270', '0'),
(81, 3, 1, 1, 5, 2, '1329', 'Urjasz', 'Zawadzki', '1996-04-27', '90120494272', '0'),
(82, 5, 1, 2, 5, 3, '1361', 'Tomasz', 'Majewski', '2000-02-17', '95010762013', '0'),
(83, 5, 1, 2, 5, 3, '1417', 'Ludmiła', 'Wysocka', '1999-08-31', '90080522361', '0'),
(84, 3, 1, 1, 5, 3, '1382', 'Marzena', 'Nowak ', '2000-06-25', '92071351640', '0'),
(85, 3, 1, 1, 5, 3, '1372', 'Julek', 'Kwiatkowski', '1993-07-08', '95112753333', '0'),
(86, 3, 1, 1, 5, 3, '1317', 'Friderich', 'Sawicki', '1993-09-01', '93082831479', '0'),
(87, 1, 1, 1, 6, 1, '1364', 'Iwan', 'Kaczmarek', '1998-02-23', '89012185796', '0'),
(88, 1, 1, 1, 6, 1, '1307', 'Gabryŝ', 'Duda', '1991-04-02', '95111537994', '0'),
(89, 1, 1, 1, 6, 1, '1302', 'Lechosław', 'Grabowski', '1993-02-12', '93061066759', '0'),
(90, 1, 1, 1, 6, 1, '1328', 'Dariusz', 'Pawlak', '1998-04-06', '96101088151', '0'),
(91, 1, 1, 1, 6, 1, '1395', 'Marzena', 'Olszewska', '1995-09-10', '310592400', '0'),
(92, 1, 1, 1, 6, 1, '1405', 'Władysław', 'Adamski', '1995-02-17', '92062437171', '0'),
(93, 2, 1, 1, 6, 1, '1407', 'Radosława', 'Michalska', '1998-01-04', '93041020506', '0'),
(94, 2, 1, 1, 6, 2, '1332', 'Zygmunt', 'Czarnecki', '1997-08-18', '91073059471', '0'),
(95, 2, 1, 1, 6, 2, '1355', 'Lechosław', 'Nowak ', '1997-10-03', '98072506232', '0'),
(96, 2, 1, 1, 6, 2, '1333', 'Krystian', 'Dąbrowski ', '1995-11-08', '91061783917', '0'),
(97, 2, 1, 1, 6, 2, '1330', 'Szczeosny', 'Nowak ', '1997-01-12', '271667870', '0'),
(98, 3, 1, 1, 6, 2, '1341', 'Jolanta', 'Jasińska', '1995-08-25', '99102923489', '0'),
(99, 3, 1, 1, 6, 3, '1306', 'Henryk', 'Kwiatkowski', '1999-08-31', '97092376616', '0'),
(100, 3, 1, 1, 6, 3, '1405', 'Wiola', 'Jaworska', '1999-04-26', '89011362389', '700'),
(101, 3, 1, 1, 6, 3, '1407', 'Bogumił', 'Michalski', '1997-03-05', '93122989056', '0'),
(102, 3, 1, 1, 6, 3, '1332', 'Frydryk', 'Kamiński', '1992-01-08', '94020307191', '0'),
(103, 5, 1, 2, 6, 3, '1355', 'Albin', 'Chmielewski', '1995-04-16', '96112573431', '0'),
(104, 2, 1, 1, 7, 1, '1333', 'Eustachy', 'Sobczak', '2000-03-08', '98041846752', '0'),
(105, 1, 1, 1, 7, 1, '1330', 'Łucja', 'Pawlak', '1995-04-06', '98071291524', '0'),
(106, 1, 1, 1, 7, 1, '1341', 'Dyta', 'Zawadzka', '1991-12-09', '99120129469', '0'),
(107, 1, 1, 1, 7, 1, '1306', 'Sobiesław', 'Walczak', '1996-01-18', '89012214890', '0'),
(108, 1, 1, 1, 7, 1, '1357', 'Bonifacy', 'Król', '1998-09-18', '92113077592', '0'),
(109, 1, 1, 1, 7, 1, '1351', 'Bartłomiej', 'Chmielewski', '1993-07-02', '98010530651', '0'),
(110, 2, 1, 1, 7, 1, '1362', 'Henio', 'Pawlak', '2000-02-15', '97070292031', '0'),
(112, 2, 1, 1, 7, 2, '1401', 'Henryk', 'Borkowski', '1996-11-17', '94121218732', '0'),
(113, 2, 1, 1, 7, 2, '1312', 'Antoni', 'Tomaszewski', '1997-05-19', '96030612270', '0'),
(114, 2, 1, 1, 7, 2, '1365', 'Urjasz', 'Zawadzki', '1994-09-14', '90120494272', '0'),
(115, 3, 1, 1, 7, 2, '1392', 'Tomasz', 'Majewski', '1993-05-03', '95010762013', '0'),
(116, 3, 1, 1, 7, 3, '1343', 'Ludmiła', 'Wysocka', '1995-07-11', '90080522361', '0'),
(117, 3, 1, 1, 7, 3, '1386', 'Marzena', 'Nowak ', '1996-06-27', '92071351640', '0'),
(118, 3, 1, 1, 7, 3, '1339', 'Julek', 'Kwiatkowski', '1996-04-24', '95112753333', '0'),
(119, 3, 1, 1, 7, 3, '1319', 'Friderich', 'Sawicki', '1998-08-06', '93082831479', '0'),
(120, 3, 1, 1, 7, 3, '1336', 'Iwan', 'Kaczmarek', '1991-11-18', '89012185796', '0'),
(121, 0, 2, 1, 1, 1, '1323', 'Maciej', 'Zielinski', '1998-10-10', '99100490774', '0'),
(122, 1, 2, 1, 1, 1, '1414', 'Adrianna', 'Jaworska', '1996-04-27', '89082917943', '0'),
(123, 1, 2, 1, 1, 1, '1326', 'Rościsława', 'Adamska', '2000-02-17', '231740146', '0'),
(124, 1, 2, 1, 1, 1, '1403', 'Jaropełk', 'Adamski', '1999-08-31', '94012194518', '0'),
(125, 1, 2, 1, 1, 1, '1371', 'Lechosław', 'Zawadzki', '2000-06-25', '97091443896', '0'),
(126, 1, 2, 1, 1, 1, '1310', 'Krystyn', 'Ostrowski', '1993-07-08', '90050620974', '0'),
(127, 2, 2, 1, 1, 1, '1321', 'Bartłomiej', 'Chmielewski', '1993-09-01', '98010530651', '0'),
(128, 2, 2, 1, 1, 2, '1406', 'Henio', 'Pawlak', '1998-02-23', '97070292031', '0'),
(129, 2, 2, 1, 1, 2, '1353', 'Sławomir', 'Wiśniewski', '1991-04-02', '99072038037', '0'),
(130, 2, 2, 1, 1, 2, '1384', 'Henryk', 'Borkowski', '1993-02-12', '94121218732', '0'),
(131, 2, 2, 1, 1, 2, '1305', 'Antoni', 'Tomaszewski', '1998-04-06', '96030612270', '0'),
(132, 3, 2, 1, 1, 2, '1329', 'Urjasz', 'Zawadzki', '1995-09-10', '90120494272', '0'),
(133, 3, 2, 1, 1, 3, '1361', 'Tomasz', 'Majewski', '1995-02-17', '95010762013', '0'),
(134, 3, 2, 1, 1, 3, '1417', 'Ludmiła', 'Wysocka', '1998-01-04', '90080522361', '0'),
(135, 3, 2, 1, 1, 3, '1382', 'Marzena', 'Nowak ', '1997-08-18', '92071351640', '0'),
(136, 3, 2, 1, 1, 3, '1372', 'Julek', 'Kwiatkowski', '1997-10-03', '95112753333', '0'),
(137, 3, 2, 1, 1, 3, '1317', 'Friderich', 'Sawicki', '1995-11-08', '93082831479', '0'),
(138, 3, 2, 1, 2, 1, '1364', 'Iwan', 'Kaczmarek', '1997-01-12', '89012185796', '0'),
(139, 1, 2, 1, 2, 1, '1307', 'Gabryŝ', 'Duda', '1995-08-25', '95111537994', '0'),
(140, 1, 2, 1, 2, 1, '1302', 'Lechosław', 'Grabowski', '1999-08-31', '93061066759', '0'),
(141, 1, 2, 1, 2, 1, '1328', 'Dariusz', 'Pawlak', '1999-04-26', '96101088151', '0'),
(142, 1, 2, 1, 2, 1, '1395', 'Marzena', 'Olszewska', '1997-03-05', '310592400', '0'),
(143, 1, 2, 1, 2, 1, '1405', 'Władysław', 'Adamski', '1992-01-08', '92062437171', '0'),
(144, 2, 2, 1, 2, 1, '1407', 'Radosława', 'Michalska', '1995-04-16', '93041020506', '0'),
(145, 2, 2, 1, 2, 2, '1332', 'Zygmunt', 'Czarnecki', '2000-03-08', '91073059471', '0'),
(146, 2, 2, 1, 2, 2, '1355', 'Lechosław', 'Nowak ', '1995-04-06', '98072506232', '0'),
(147, 2, 2, 1, 2, 2, '1333', 'Krystian', 'Dąbrowski ', '1991-12-09', '91061783917', '0'),
(148, 2, 2, 1, 2, 2, '1330', 'Szczeosny', 'Nowak ', '1996-01-18', '271667870', '0'),
(149, 3, 2, 1, 2, 2, '1341', 'Jolanta', 'Jasińska', '1998-09-18', '99102923489', '0'),
(150, 3, 2, 1, 2, 3, '1306', 'Henryk', 'Kwiatkowski', '1993-07-02', '97092376616', '0'),
(151, 3, 2, 1, 2, 3, '1300', 'Wiola', 'Jaworska', '2000-02-15', '89011362389', '0'),
(152, 3, 2, 1, 2, 3, '1300', 'Bogumił', 'Michalski', '1994-03-18', '93122989056', '0'),
(153, 3, 2, 1, 2, 3, '1300', 'Frydryk', 'Kamiński', '1996-11-17', '94020307191', '0'),
(154, 3, 2, 1, 2, 3, '1300', 'Albin', 'Chmielewski', '1997-05-19', '96112573431', '0'),
(155, 1, 2, 1, 3, 1, '1300', 'Eustachy', 'Sobczak', '1994-09-14', '98041846752', '0'),
(156, 1, 2, 1, 3, 1, '1300', 'Łucja', 'Pawlak', '1993-05-03', '98071291524', '0'),
(157, 1, 2, 1, 3, 1, '1300', 'Dyta', 'Zawadzka', '1995-07-11', '99120129469', '0'),
(158, 1, 2, 1, 3, 1, '1300', 'Sobiesław', 'Walczak', '1996-06-27', '89012214890', '0'),
(159, 1, 2, 1, 3, 1, '1300', 'Bonifacy', 'Król', '1996-04-24', '92113077592', '0'),
(160, 1, 2, 1, 3, 1, '1300', 'Bartłomiej', 'Chmielewski', '1998-08-06', '98010530651', '0'),
(161, 2, 2, 1, 3, 1, '1300', 'Henio', 'Pawlak', '1991-11-18', '97070292031', '0'),
(162, 2, 2, 1, 3, 2, '1300', 'Sławomir', 'Wiśniewski', '1998-10-10', '99072038037', '0'),
(163, 2, 2, 1, 3, 2, '1300', 'Henryk', 'Borkowski', '1996-04-27', '94121218732', '0'),
(164, 2, 2, 1, 3, 2, '1300', 'Antoni', 'Tomaszewski', '2000-02-17', '96030612270', '0'),
(165, 2, 2, 1, 3, 2, '1300', 'Urjasz', 'Zawadzki', '1999-08-31', '90120494272', '0'),
(166, 3, 2, 1, 3, 2, '1300', 'Tomasz', 'Majewski', '1999-04-26', '95010762013', '0'),
(167, 3, 2, 1, 3, 3, '1300', 'Ludmiła', 'Wysocka', '1997-03-05', '90080522361', '0'),
(168, 3, 2, 1, 3, 3, '1300', 'Marzena', 'Nowak ', '1992-01-08', '92071351640', '0'),
(169, 3, 2, 1, 3, 3, '1300', 'Julek', 'Kwiatkowski', '1995-04-16', '95112753333', '0'),
(170, 3, 2, 1, 3, 3, '1300', 'Friderich', 'Sawicki', '2000-03-08', '93082831479', '0');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `tryb_studiow`
--

CREATE TABLE `tryb_studiow` (
  `Id_tryb` int(11) NOT NULL,
  `tryb_studiow` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `tryb_studiow`
--

INSERT INTO `tryb_studiow` (`Id_tryb`, `tryb_studiow`) VALUES
(1, '1 stopnia'),
(2, '2 stopnia');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `typy_zajec`
--

CREATE TABLE `typy_zajec` (
  `id_typ_zajec` int(11) NOT NULL,
  `nazwa_typ_zajec` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `typy_zajec`
--

INSERT INTO `typy_zajec` (`id_typ_zajec`, `nazwa_typ_zajec`) VALUES
(1, 'Wykład'),
(2, 'Ćwiczenia'),
(3, 'Laboratoria'),
(4, 'Projekt'),
(5, 'Praktyki');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `tytul_naukowy`
--

CREATE TABLE `tytul_naukowy` (
  `Id_tytul` int(11) NOT NULL,
  `nazwa_tytulu` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `tytul_naukowy`
--

INSERT INTO `tytul_naukowy` (`Id_tytul`, `nazwa_tytulu`) VALUES
(1, 'Magister'),
(2, 'Doktor inż.'),
(3, 'Doktor Habilitowany'),
(4, 'Profesor nadzywczajny'),
(5, 'Profesor');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `wydzial`
--

CREATE TABLE `wydzial` (
  `id_wydzial` int(11) NOT NULL,
  `nazwa_wydzialu` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `wydzial`
--

INSERT INTO `wydzial` (`id_wydzial`, `nazwa_wydzialu`) VALUES
(1, 'Informatyki'),
(2, 'Elektroniki');

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `gr_dziekan`
--
ALTER TABLE `gr_dziekan`
  ADD PRIMARY KEY (`id_grupy`);

--
-- Indeksy dla tabeli `katedra`
--
ALTER TABLE `katedra`
  ADD PRIMARY KEY (`id_katedry`),
  ADD KEY `FK_KATEDRA_RELATIONS_WYDZIAL` (`id_wydzial`);

--
-- Indeksy dla tabeli `kierunek`
--
ALTER TABLE `kierunek`
  ADD PRIMARY KEY (`id_kierunek`),
  ADD KEY `FK_KIERUNEK_RELATIONS_WYDZIAL` (`id_wydzial`);

--
-- Indeksy dla tabeli `plan`
--
ALTER TABLE `plan`
  ADD PRIMARY KEY (`Id_przedmiot`,`id_prowadzacy`,`id_specjalnosc`,`id_grupy`,`id_semestr`,`Id_tryb`,`id_kierunek`),
  ADD KEY `FK_PLAN_PLAN2_PROWADZA` (`id_prowadzacy`),
  ADD KEY `FK_PLAN_PLAN3_SPECJALN` (`id_specjalnosc`),
  ADD KEY `FK_PLAN_PLAN4_GR_DZIEK` (`id_grupy`),
  ADD KEY `FK_PLAN_PLAN5_SEMESTR` (`id_semestr`),
  ADD KEY `FK_PLAN_PLAN6_TRYB_STU` (`Id_tryb`),
  ADD KEY `FK_PLAN_PLAN7_KIERUNEK` (`id_kierunek`);

--
-- Indeksy dla tabeli `prowadzacy`
--
ALTER TABLE `prowadzacy`
  ADD PRIMARY KEY (`id_prowadzacy`),
  ADD KEY `FK_PROWADZA_RELATIONS_TYTUL_NA` (`Id_tytul`),
  ADD KEY `FK_PROWADZA_RELATIONS_KATEDRA` (`id_katedry`);

--
-- Indeksy dla tabeli `przedmioty`
--
ALTER TABLE `przedmioty`
  ADD PRIMARY KEY (`Id_przedmiot`),
  ADD KEY `FK_PRZEDMIO_RELATIONS_TYPY_ZAJ` (`id_typ_zajec`);

--
-- Indeksy dla tabeli `semestr`
--
ALTER TABLE `semestr`
  ADD PRIMARY KEY (`id_semestr`);

--
-- Indeksy dla tabeli `specjalnosc`
--
ALTER TABLE `specjalnosc`
  ADD PRIMARY KEY (`id_specjalnosc`);

--
-- Indeksy dla tabeli `studenci`
--
ALTER TABLE `studenci`
  ADD PRIMARY KEY (`Id_student`),
  ADD KEY `FK_STUDENCI_RELATIONS_KIERUNEK` (`id_kierunek`),
  ADD KEY `FK_STUDENCI_RELATIONS_GR_DZIEK` (`id_grupy`),
  ADD KEY `FK_STUDENCI_RELATIONS_SEMESTR` (`id_semestr`),
  ADD KEY `FK_STUDENCI_RELATIONS_SPECJALN` (`id_specjalnosc`),
  ADD KEY `FK_STUDENCI_RELATIONS_TRYB_STU` (`Id_tryb`);

--
-- Indeksy dla tabeli `tryb_studiow`
--
ALTER TABLE `tryb_studiow`
  ADD PRIMARY KEY (`Id_tryb`);

--
-- Indeksy dla tabeli `typy_zajec`
--
ALTER TABLE `typy_zajec`
  ADD PRIMARY KEY (`id_typ_zajec`);

--
-- Indeksy dla tabeli `tytul_naukowy`
--
ALTER TABLE `tytul_naukowy`
  ADD PRIMARY KEY (`Id_tytul`);

--
-- Indeksy dla tabeli `wydzial`
--
ALTER TABLE `wydzial`
  ADD PRIMARY KEY (`id_wydzial`);

--
-- Ograniczenia dla zrzutów tabel
--

--
-- Ograniczenia dla tabeli `katedra`
--
ALTER TABLE `katedra`
  ADD CONSTRAINT `FK_KATEDRA_RELATIONS_WYDZIAL` FOREIGN KEY (`id_wydzial`) REFERENCES `wydzial` (`id_wydzial`);

--
-- Ograniczenia dla tabeli `kierunek`
--
ALTER TABLE `kierunek`
  ADD CONSTRAINT `FK_KIERUNEK_RELATIONS_WYDZIAL` FOREIGN KEY (`id_wydzial`) REFERENCES `wydzial` (`id_wydzial`);

--
-- Ograniczenia dla tabeli `plan`
--
ALTER TABLE `plan`
  ADD CONSTRAINT `FK_PLAN_PLAN2_PROWADZA` FOREIGN KEY (`id_prowadzacy`) REFERENCES `prowadzacy` (`id_prowadzacy`),
  ADD CONSTRAINT `FK_PLAN_PLAN3_SPECJALN` FOREIGN KEY (`id_specjalnosc`) REFERENCES `specjalnosc` (`id_specjalnosc`),
  ADD CONSTRAINT `FK_PLAN_PLAN4_GR_DZIEK` FOREIGN KEY (`id_grupy`) REFERENCES `gr_dziekan` (`id_grupy`),
  ADD CONSTRAINT `FK_PLAN_PLAN5_SEMESTR` FOREIGN KEY (`id_semestr`) REFERENCES `semestr` (`id_semestr`),
  ADD CONSTRAINT `FK_PLAN_PLAN6_TRYB_STU` FOREIGN KEY (`Id_tryb`) REFERENCES `tryb_studiow` (`Id_tryb`),
  ADD CONSTRAINT `FK_PLAN_PLAN7_KIERUNEK` FOREIGN KEY (`id_kierunek`) REFERENCES `kierunek` (`id_kierunek`),
  ADD CONSTRAINT `FK_PLAN_PLAN_PRZEDMIO` FOREIGN KEY (`Id_przedmiot`) REFERENCES `przedmioty` (`Id_przedmiot`);

--
-- Ograniczenia dla tabeli `prowadzacy`
--
ALTER TABLE `prowadzacy`
  ADD CONSTRAINT `FK_PROWADZA_RELATIONS_KATEDRA` FOREIGN KEY (`id_katedry`) REFERENCES `katedra` (`id_katedry`),
  ADD CONSTRAINT `FK_PROWADZA_RELATIONS_TYTUL_NA` FOREIGN KEY (`Id_tytul`) REFERENCES `tytul_naukowy` (`Id_tytul`);

--
-- Ograniczenia dla tabeli `przedmioty`
--
ALTER TABLE `przedmioty`
  ADD CONSTRAINT `FK_PRZEDMIO_RELATIONS_TYPY_ZAJ` FOREIGN KEY (`id_typ_zajec`) REFERENCES `typy_zajec` (`id_typ_zajec`);

--
-- Ograniczenia dla tabeli `studenci`
--
ALTER TABLE `studenci`
  ADD CONSTRAINT `FK_STUDENCI_RELATIONS_GR_DZIEK` FOREIGN KEY (`id_grupy`) REFERENCES `gr_dziekan` (`id_grupy`),
  ADD CONSTRAINT `FK_STUDENCI_RELATIONS_KIERUNEK` FOREIGN KEY (`id_kierunek`) REFERENCES `kierunek` (`id_kierunek`),
  ADD CONSTRAINT `FK_STUDENCI_RELATIONS_SEMESTR` FOREIGN KEY (`id_semestr`) REFERENCES `semestr` (`id_semestr`),
  ADD CONSTRAINT `FK_STUDENCI_RELATIONS_SPECJALN` FOREIGN KEY (`id_specjalnosc`) REFERENCES `specjalnosc` (`id_specjalnosc`),
  ADD CONSTRAINT `FK_STUDENCI_RELATIONS_TRYB_STU` FOREIGN KEY (`Id_tryb`) REFERENCES `tryb_studiow` (`Id_tryb`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
