package trenirovkadoma.JavaColectionsFramevork.HashCodeAndEqualsMetod;

import java.util.Objects;

class Person {
        private int id;
        private String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override// переопределили метод
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override// переопределили метод
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            trenirovkadoma.JavaColectionsFramevork.HashCodeAndEqualsMetod.Person person = (trenirovkadoma.JavaColectionsFramevork.HashCodeAndEqualsMetod.Person) o;
            return id == person.id &&
                    Objects.equals(name, person.name);
        }

        @Override// переопределили метод
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }

/*
контракт hashcode() and equals()
1) У вдух проверяемых объектов вызываем метод hashcode()
если хэши разные -> два объекта точно разные.

2) если хэши одинаковые(коллизия) -> equals()

3) equals() -> выдает ответ
 */