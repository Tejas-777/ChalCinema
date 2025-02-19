import React, { useState } from 'react';
import { Alert, View, StyleSheet } from 'react-native';
import { Button, Card, TextInput } from 'react-native-paper';
import axios from 'axios';

const API_BASE_URL = 'http://localhost:7777/theatre_admin';

const AddTheatre = ({ navigation }) => {
  const [theatre, setTheatre] = useState({
    name: '',
    numberOfScreens: '',
    adminId: '',
    cityId: '',
  });

  const handleAddTheatre = async () => {
    if (!theatre.name || !theatre.numberOfScreens || !theatre.adminId || !theatre.cityId) {
      Alert.alert('Error', 'Please fill in all fields');
      return;
    }

    const payload = {
      name: theatre.name,
      numberOfScreens: parseInt(theatre.numberOfScreens),
      adminId: parseInt(theatre.adminId),
      cityId: parseInt(theatre.cityId),
    };

    try {
      await axios.post(`${API_BASE_URL}/theatre`, payload);
      Alert.alert('Success', 'Theatre added successfully', [
        { text: 'OK', onPress: () => navigation.navigate('Dashboard') },
      ]);
      setTheatre({ name: '', numberOfScreens: '', adminId: '', cityId: '' });
    } catch (error) {
      Alert.alert('Error', 'Failed to add theatre');
    }
  };

  return (
    <View style={styles.container}>
      <Card style={styles.card}>
        <TextInput
          label="Theatre Name"
          value={theatre.name}
          onChangeText={(text) => setTheatre({ ...theatre, name: text })}
          style={styles.input}
        />
        <TextInput
          label="Number of Screens"
          value={theatre.numberOfScreens}
          keyboardType="numeric"
          onChangeText={(text) => setTheatre({ ...theatre, numberOfScreens: text })}
          style={styles.input}
        />
        <TextInput
          label="Admin ID"
          value={theatre.adminId}
          keyboardType="numeric"
          onChangeText={(text) => setTheatre({ ...theatre, adminId: text })}
          style={styles.input}
        />
        <TextInput
          label="City ID"
          value={theatre.cityId}
          keyboardType="numeric"
          onChangeText={(text) => setTheatre({ ...theatre, cityId: text })}
          style={styles.input}
        />
        <Button mode="contained" onPress={handleAddTheatre} style={styles.button}>
          Add Theatre
        </Button>
      </Card>
    </View>
  );
};

export default AddTheatre;

const styles = StyleSheet.create({
  container: { flex: 1, justifyContent: 'center', padding: 20 },
  card: { padding: 20, backgroundColor: '#f5f5f5' },
  input: { marginBottom: 10 },
  button: { marginTop: 10 },
});
