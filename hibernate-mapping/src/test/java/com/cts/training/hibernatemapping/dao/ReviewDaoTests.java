package com.cts.training.hibernatemapping.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cts.training.hibernatemapping.entity.Course;
import com.cts.training.hibernatemapping.entity.Review;

public class ReviewDaoTests {
	@Autowired
	private CourseDao courseDao; 
	@Autowired
	private ReviewDao reviewDao;
	
	@Test
	void testaddReviewAndCourse()  {

		Review review = new Review();
		review.setReview("excellent");
        Course course = new Course();
		course.setName("python");
		
		
		Review added = this.reviewDao.addReviewAndCourse( review,course);
		assertEquals("Python", added.getCourse());
		
	}

}
