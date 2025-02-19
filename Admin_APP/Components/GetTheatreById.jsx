import React, { useState } from 'react'; 
import { Alert, View, StyleSheet } from 'react-native';
import { Button, Card, Text, TextInput } from 'react-native-paper';
import axios from 'axios';

const API_BASE_URL = 'http://localhost:7777/theatre_admin'; 

const GetTheatreById = () => {
  const [theatreId, setTheatreId] = useState('');
  const [theatre, setTheatre] = useState(null);
  const [loading, setLoading] = useState(false);

  const fetchTheatreById = async () => {
    if (!theatreId.trim()) {
      Alert.alert('Error', 'Please enter a Theatre ID');
      return;
    }

    setLoading(true);
    try {
      const response = await axios.get(`${API_BASE_URL}/theatre/${theatreId}`);
      
      
      setTheatre(response.data);
    } catch (error) {
      Alert.alert('Error', 'Theatre not found');
      setTheatre(null);
    } finally {
      setLoading(false);
    }
  };

  return (
    <View style={styles.container}>
      <Card style={styles.card}>
        <Text style={styles.title}>Find Theatre by ID</Text>
        <TextInput
          label="Enter Theatre ID"
          mode="outlined"
          keyboardType="numeric"
          value={theatreId}
          onChangeText={setTheatreId}
          style={styles.input}
        />
        <Button mode="contained" onPress={fetchTheatreById} loading={loading} style={styles.button}>
          Get Theatre
        </Button>

        {theatre && (
          <Card style={styles.resultCard}>
            <Text style={styles.resultTitle}>🎬 Theatre Details</Text>
            <Text style={styles.resultText}>🆔 ID: {theatre.theatre_id}</Text>
            <Text style={styles.resultText}>🏛 Name: {theatre.name}</Text>
            <Text style={styles.resultText}>🎭 Screens: {theatre.no_of_screens}</Text>
          </Card>
        )}
      </Card>
    </View>
  );
};

export default GetTheatreById;

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    padding: 20,
    backgroundColor: '#F4F4F4',
  },
  card: {
    padding: 20,
    backgroundColor: 'white',
    borderRadius: 10,
    elevation: 4,
  },
  title: {
    fontSize: 24,
    fontWeight: 'bold',
    textAlign: 'center',
    marginBottom: 15,
  },
  input: {
    marginBottom: 10,
  },
  button: {
    backgroundColor: '#6200EE',
    marginVertical: 10,
  },
  resultCard: {
    marginTop: 20,
    padding: 15,
    backgroundColor: '#E3F2FD',
    borderRadius: 10,
    elevation: 3,
  },
  resultTitle: {
    fontSize: 20,
    fontWeight: 'bold',
    color: '#1E88E5',
    marginBottom: 10,
  },
  resultText: {
    fontSize: 16,
    marginBottom: 5,
  },
});
