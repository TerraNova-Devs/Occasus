# Set the storage engine
SET DEFAULT_STORAGE_ENGINE = INNODB;

# Enable foreign key constraints
SET FOREIGN_KEY_CHECKS = 1;

# Create settlements table if it does not exist
CREATE TABLE IF NOT EXISTS `playersettings_table` (
    `PUUID` varchar(36) NOT NULL,
    `settings` varchar(320) NOT NULL,
        PRIMARY KEY (`PUUID`)
) DEFAULT CHARSET=utf8
COLLATE=utf8_unicode_ci
