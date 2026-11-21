extends Area3D

func _on_body_entered(body: Node3D) -> void:
	if body.name == "Player":
		# Chama a função de reiniciar apenas quando for seguro
		get_tree().call_deferred("reload_current_scene")
