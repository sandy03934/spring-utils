package com.sandy03934.repositories;

import com.sandy03934.entities.UserPreference;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPreferenceRepository  extends PagingAndSortingRepository<UserPreference, String> {
}
