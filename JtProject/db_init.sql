-- Create Order table
CREATE TABLE IF NOT EXISTS Order (
    OrderID INT AUTO_INCREMENT PRIMARY KEY,
    CardID VARCHAR(50),
    UserID INT,
    TotalCost DECIMAL(10, 2),
    DatePurchased DATE
);
-- Create Item table
CREATE TABLE IF NOT EXISTS Item (
    ItemID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100),
    Price DECIMAL(10, 2),
    Provider VARCHAR(100),
    RecommendedItems JSON
);
-- Create Customer table
CREATE TABLE IF NOT EXISTS Customer (
    CustomerID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100),
    Email VARCHAR(100),
    CardID VARCHAR(50),
    NumberOfCoupons INT,
    CouponAccumulator DECIMAL(10, 2),
    Address VARCHAR(255)
);

-- Create Guest table
CREATE TABLE IF NOT EXISTS Guest (
    GuestID INT AUTO_INCREMENT PRIMARY KEY,
    CartID VARCHAR(50)
);
-- Create User table
CREATE TABLE IF NOT EXISTS User (
     UserID INT AUTO_INCREMENT PRIMARY KEY,
     Username VARCHAR(50),
     Password VARCHAR(100),
     UserType VARCHAR(8)
);
-- Create Cart table
CREATE TABLE IF NOT EXISTS Cart (
    CartID VARCHAR(50) PRIMARY KEY,
    ContainedItems JSON
);