import java.util.Date;

/**
 * A fix-sized array of students array length should always be equal to the
 * number of stored elements after the element was removed the size of the array
 * should be equal to the number of stored elements after the element was added
 * the size of the array should be equal to the number of stored elements null
 * elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given
 * class, interface or method DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;

	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	public StudentGroup(Student[] students) {
		this.students = students;
	}

	@Override
	public Student[] getStudents() {
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		if (students == null) {
			throw new IllegalArgumentException("Threw an IllegalArgumentException");
		} else {
			this.students = students;
		}
	}

	@Override
	public Student getStudent(int index) {
		if (index < 0 || index >= students.length) {
			throw new IllegalArgumentException("Threw an IllegalArgumentException");
		} else {
			return students[index];
		}
	}

	@Override
	public void setStudent(Student student, int index) {
		if (index < 0 || index >= students.length || student == null) {
			throw new IllegalArgumentException("Threw an IllegalArgumentException");
		} else {
			Student[] newStudents = new Student[students.length];
			for (int i = 0; i < students.length; i++) {
				newStudents[i] = students[i];
			}
			newStudents[index] = student;
			this.students = newStudents;
		}
	}

	@Override
	public void addFirst(Student student) {
		if (student == null) {
			throw new IllegalArgumentException("Threw an IllegalArgumentException");
		} else {
			Student[] newStudents = new Student[students.length + 1];
			for (int i = 0; i < students.length; i++) {
				newStudents[i + 1] = students[i];
			}
			newStudents[0] = student;
			this.students = newStudents;
		}
	}

	@Override
	public void addLast(Student student) {
		if (student == null) {
			throw new IllegalArgumentException("Threw an IllegalArgumentException");
		} else {
			Student[] newStudents = new Student[students.length + 1];
			for (int i = 0; i < students.length; i++) {
				newStudents[i] = students[i];
			}
			newStudents[students.length + 1] = student;
			this.students = newStudents;
		}
	}

	@Override
	public void add(Student student, int index) {
		if (index < 0 || index >= students.length || student == null) {
			throw new IllegalArgumentException("Threw an IllegalArgumentException");
		} else {
			Student[] newStudents = new Student[students.length];
			for (int i = 0; i < students.length; i++) {
				newStudents[i] = students[i];
			}
			newStudents[index] = student;
			this.students = newStudents;
		}
	}

	@Override
	public void remove(int index) {
		if (index < 0 || index >= students.length) {
			throw new IllegalArgumentException("Threw an IllegalArgumentException");
		} else {
			Student[] newStudents = new Student[students.length - 1];
			if (index == students.length) {
				for (int i = 0; i < students.length - 1; i++) {
					newStudents[i] = students[i];
				}
			} else {
				for (int i = 0; i < index; i++) {
					newStudents[i] = students[i];
				}
				for (int i = index + 1; i < students.length - 1; i++) {
					newStudents[i] = students[i];
				}
			}
			this.students = newStudents;
		}
	}

	@Override
	public void remove(Student student) {
		if (student == null) {
			throw new IllegalArgumentException("Threw an IllegalArgumentException");
		} else {
			for (int i = 0; i < students.length; i++) {
				if ((students[i].compareTo(student)) != 0) {
					throw new IllegalArgumentException("Student not exist");
				} else {
					int j = 0;
					for (int k = 0; k < students.length; k++) {
						if ((students[k].compareTo(student)) == 0) {
							j = k;
						}
					}
					Student[] newStudents = new Student[students.length - 1];
					if (j == students.length) {
						for (int n = 0; n < students.length - 1; n++) {
							newStudents[n] = students[n];
						}
					} else {
						for (int m = 0; m < j; m++) {
							newStudents[m] = students[m];
						}
						for (int d = j + 1; d < students.length - 1; d++) {
							newStudents[d] = students[d];
						}
					}
					this.students = newStudents;
				}
			}
		}
	}

	@Override
	public void removeFromIndex(int index) {
		if (index < 0 || index >= students.length) {
			throw new IllegalArgumentException("Threw an IllegalArgumentException");
		} else {
			Student[] newStudents = new Student[index];
			for (int i = 0; i < index; i++) {
				newStudents[i] = students[i];
			}
			this.students = newStudents;
		}
	}

	@Override
	public void removeFromElement(Student student) {
		if (student == null) {
			throw new IllegalArgumentException("Threw an IllegalArgumentException");
		} else {
			for (int i = 0; i < students.length; i++) {
				if ((students[i].compareTo(student)) != 0) {
					break;
				} else {
					int j = 0;
					for (int k = 0; k < students.length; k++) {
						if ((students[k].compareTo(student)) == 0) {
							j = k;

						}
					}
					Student[] newStudents = new Student[j];
					for (int n = 0; n < j; n++) {
						newStudents[n] = students[n];
					}
					this.students = newStudents;
				}
			}
		}
	}

	@Override
	public void removeToIndex(int index) {
		if (index < 0 || index >= students.length) {
			throw new IllegalArgumentException("Threw an IllegalArgumentException");
		} else {
			int value = students.length - index;
			Student[] newStudents = new Student[value];
			int j = 0;
			for (int i = index; i < students.length; i++) {
				newStudents[j] = students[i];
				j++;
			}
			this.students = newStudents;
		}
	}

	@Override
	public void removeToElement(Student student) {
		if (student == null) {
			throw new IllegalArgumentException("Threw an IllegalArgumentException");
		} else {
			for (int i = 0; i < students.length; i++) {
				if ((students[i].compareTo(student)) != 0) {
					break;
				} else {
					int j = 0;
					for (int k = 0; k < students.length; k++) {
						if ((students[k].compareTo(student)) == 0) {
							j = k;

						}
					}
					Student[] newStudents = new Student[j];
					int n = 0;
					for (int m = j; m < students.length; m++) {
						newStudents[n] = students[m];
						n++;
					}
					this.students = newStudents;
				}
			}
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
