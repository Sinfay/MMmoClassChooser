package com.company;

public class CharacterClass {

        public String className;
        public boolean isSupport;
        public boolean isCaster;
        public boolean doesKameHameHa;
        public boolean isTank;
        public boolean isRanged;
        public boolean useBow;
        public boolean isAssasin;
        public boolean isMale;
        public boolean isEdgeLord;
        public boolean haveBigSword;
        public boolean isBoxer;

        CharacterClass(String className,
                       boolean isSupport,
                       boolean isCaster,
                       boolean doesKameHameHa,
                       boolean isTank,
                       boolean isRanged,
                       boolean useBow,
                       boolean isAssasin,
                       boolean isMale,
                       boolean isEdgeLord,
                       boolean haveBigSword,
                       boolean isBoxer) {

                this.className = className;
                this.isSupport = isSupport;
                this.isCaster = isCaster;
                this.doesKameHameHa = doesKameHameHa;
                this.isTank = isTank;
                this.isRanged = isRanged;
                this.useBow = useBow;
                this.isAssasin = isAssasin;
                this.isMale = isMale;
                this.isEdgeLord = isEdgeLord;
                this.haveBigSword = haveBigSword;
                this.isBoxer = isBoxer;
        }

        public String toString() {
                return className;
        }
}


