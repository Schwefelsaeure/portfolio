// Note: "max_force" and "max_speed" are constants
steering_force = truncate(steering_direction, max_force)
acceleration   = steering_force / mass
velocity       = truncate (velocity + acceleration, max_speed)
position       = position + velocity
