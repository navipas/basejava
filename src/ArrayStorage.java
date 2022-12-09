import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];

    void clear() {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                storage[i] = null;
            }
        }
    }

    void save(Resume r) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = r;
                break;
            }
        }
    }

    Resume get(String uuid) {

        for (int i = 0; i < storage.length; i++) {
            Resume resume = storage[i];
            if (resume.uuid.equals(uuid)) {
                return resume;
            }
        }
        return null;
    }

    void delete(String uuid) {
        for (int i = 0; i < storage.length; i++) {
            Resume resume = storage[i];
            if (resume.uuid.equals(uuid)) {
                storage[i] = null;
                break;
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        int count = 0;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                count = i;
            }
        }
        return Arrays.copyOf(storage, count);
    }

    int size() {
        int count = 0;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                count = i;
            }
        }
        return count + 1;
    }
}
