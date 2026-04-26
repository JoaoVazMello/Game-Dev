extends Control


# Called when the node enters the scene tree for the first time.
func _ready() -> void:
	pass # Replace with function body.

# Called every frame. 'delta' is the elapsed time since the previous frame.
func _process(delta: float) -> void:

	
	pass

func _on_button_pressed() -> void:
	get_tree().change_scene_to_file("res://Cenas/game.tscn")
	
func _on_button_2_pressed() -> void:
	get_tree().quit()
	pass

## fazer uma "animaçao" no mouse

func _on_button_3_button_down() -> void:
	$ColorRect/Mouse.position += Vector2(-5, -3)
	pass # Replace with function body.

func _on_button_3_button_up() -> void:
	$ColorRect/Mouse.position += Vector2(5, 3)
	pass # Replace with function body.
