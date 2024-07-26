from abc import ABC, abstractmethod


class Interface1(ABC):
    @abstractmethod
    def method1a(self):
        pass

    @abstractmethod
    def method1b(self):
        pass


class Interface2(ABC):
    @abstractmethod
    def method2a(self):
        pass

    @abstractmethod
    def method2b(self):
        pass


class Interface3(ABC):
    @abstractmethod
    def method3a(self):
        pass

    @abstractmethod
    def method3b(self):
        pass


class CombinedInterface(Interface1, Interface2, Interface3):
    @abstractmethod
    def new_method(self):
        pass


class SomeConcreteClass:
    pass


class MyClass(SomeConcreteClass, CombinedInterface):
    def method1a(self):
        print("Implementation of method1a")

    def method1b(self):
        print("Implementation of method1b")

    def method2a(self):
        print("Implementation of method2a")

    def method2b(self):
        print("Implementation of method2b")

    def method3a(self):
        print("Implementation of method3a")

    def method3b(self):
        print("Implementation of method3b")

    def new_method(self):
        print("Implementation of new_method")


def method_with_interface1(obj: Interface1):
    print("Method with Interface1 argument")
    obj.method1a()
    obj.method1b()


def method_with_interface2(obj: Interface2):
    print("Method with Interface2 argument")
    obj.method2a()
    obj.method2b()


def method_with_interface3(obj: Interface3):
    print("Method with Interface3 argument")
    obj.method3a()
    obj.method3b()


def method_with_combined_interface(obj: CombinedInterface):
    print("Method with CombinedInterface argument")
    obj.method1a()
    obj.method1b()
    obj.method2a()
    obj.method2b()
    obj.method3a()
    obj.method3b()
    obj.new_method()


if __name__ == "__main__":
    my_obj = MyClass()
    method_with_interface1(my_obj)
    method_with_interface2(my_obj)
    method_with_interface3(my_obj)
    method_with_combined_interface(my_obj)
