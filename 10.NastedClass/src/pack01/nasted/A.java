package pack01.nasted;

public class A {
	int aField = 10; // 멤버중에 어떤것일까? : Main에서 aField를 출력해보기. //인스턴스 변수
	// 인스턴스화 과정에서 사용되는 생성자 메소드는 별도로 구현하지 않으면 A(){}로 제공되고 있다.(JVM무시)

	public A() {

	}

	// ※내가 알고있는 모든것들은 필드(멤버)가 될수있다.※
	public class B {
		B() {
			System.out.println("B객체 생성됨");
		}

		int bField;

		void methodB() {
			System.out.println("메소드");
		}

	}

	static class C {
		C() {
			System.out.println("C객체가 생성됨");
		}

		int fieldC;

		void methodC() {
			System.out.println("C메소드");
		}
	}

	// A의 멤버
	public void methodD() {
		// A의 멤버일까? 아닐까?
		class D {
			D() {
				System.out.println("D가 생성됨");
			}

			int fieldD;

			void methodD() {
				System.out.println("메소드 D");
			}
		}
		D d = new D();
		System.out.println(d.fieldD);
		d.methodD();
	}

	// 지역변수, 로컬변수
	// 메소드 내에서만 사용이 가능함
	int methodA() {
		int data = 10;
		return data;
	}
	// static : 메모리에 먼저 올라가있음 <- 해당타입(A)에 .찍으면 접근 및 사용가능
	// instance : 메모리에 new할때 올라감 <- 인스턴스화 한 객체에 .찍으면 접근 및 사용가능

	public static class AA {
		public static class AAB {
			void moethdAAB() {
				System.out.println("AAB!");
			}
		}

		public class BB {
			void moethdAAB() {
				System.out.println("BB!");
			}

			public class CC {
				void moethdAAB() {
					System.out.println("CC!");
				}

				public class DD {
					int a = 10;
				}
			}
		}
	}

}