extends Area2D

@export var speed = 800

# Called when the node enters the scene tree for the first time.
func _ready() -> void:
	pass # Replace with function body.


# Called every frame. 'delta' is the elapsed time since the previous frame.
func _process(delta: float) -> void:
	
	var x = 0
	
	if(Input.is_action_pressed("ui_left")):
		x -= 1
	if(Input.is_action_pressed("ui_right")):
		x += 1
	
	position += Vector2(x, 0) * speed * delta
	
	position.x = clamp(position.x, 80, 1070)


func _on_body_entered(body: Node2D) -> void:
	if(body.is_in_group("Bomba")):
		print("bateu na bomba")
	elif (body.is_in_group("apple")):
		print("bateu na appple")
	
	body.global_position.y = 0
	body.global_position.x = randf_range(80, 1070)
	
	
	pass # Replace with function body.
