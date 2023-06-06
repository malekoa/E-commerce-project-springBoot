CREATE TABLE IF NOT EXISTS `categories` (
    `categoryid` int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(255) NOT NULL,
    PRIMARY KEY (`categoryid`)
);

CREATE TABLE IF NOT EXISTS `login` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `username` varchar(255) NOT NULL,
    `password` varchar(255) NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `products` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(255) NOT NULL,
    `image` text NOT NULL,
    `categoryid` int(11) NOT NULL,
    `quantity` int(11) NOT NULL,
    `price` int(11) NOT NULL,
    `weight` int(11) NOT NULL,
    `description` text NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `users` (
    `user_id` int(11) NOT NULL AUTO_INCREMENT,
    `username` varchar(255) NOT NULL,
    `password` varchar(255) NOT NULL,
    `role` varchar(250) NOT NULL DEFAULT 'ROLE_USERS',
    `enabled` tinyint(4) NOT NULL,
    `email` varchar(255) NOT NULL,
    PRIMARY KEY (`user_id`)
);

INSERT IGNORE INTO `users` (`user_id`, `username`, `password`, `role`, `enabled`, `email`) VALUES
(1, 'admin', 'admin', 'ROLE_ADMIN', 1, 'admin@myshop.com');