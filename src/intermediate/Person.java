package intermediate;
    class Person {
        String name;
        int age;

        public Person(String name,int age) {
            this.name = name;
            this.age = age;
        }

        public Person() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "{" + this.name + "," + this.age + "}";
        }
    }