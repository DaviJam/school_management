package eu.ensup.service;

import java.util.List;

/**
 * The interface User service.
 *
 * @param <T> the type parameter
 */
public interface UserService<T> {
    /**
     * Create t.
     *
     * @param personDTO the person dto
     * @return the t
     */
    T create(T personDTO);

    /**
     * Update t.
     *
     * @param personDTO the person dto
     * @return the t
     */
    T update(T personDTO);

    /**
     * Get t.
     *
     * @param personDTO the person dto
     * @return the t
     */
    T get(T personDTO);

    /**
     * Gets all.
     *
     * @return the all
     */
    List<T> getAll();

    /**
     * Delete.
     *
     * @param personDTO the person dto
     */
    void delete(T personDTO);
}
