/* 
 * Easy!Appointments API
 *
 * These are the OpenAPI specs that describe the REST API of Easy!Appointments.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@easyappointments.org
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// AdminRecordSettings
    /// </summary>
    [DataContract]
        public partial class AdminRecordSettings :  IEquatable<AdminRecordSettings>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AdminRecordSettings" /> class.
        /// </summary>
        /// <param name="username">username.</param>
        /// <param name="password">password.</param>
        /// <param name="notifications">notifications.</param>
        /// <param name="calendarView">calendarView.</param>
        public AdminRecordSettings(string username = default(string), string password = default(string), bool? notifications = default(bool?), string calendarView = default(string))
        {
            this.Username = username;
            this.Password = password;
            this.Notifications = notifications;
            this.CalendarView = calendarView;
        }
        
        /// <summary>
        /// Gets or Sets Username
        /// </summary>
        [DataMember(Name="username", EmitDefaultValue=false)]
        public string Username { get; set; }

        /// <summary>
        /// Gets or Sets Password
        /// </summary>
        [DataMember(Name="password", EmitDefaultValue=false)]
        public string Password { get; set; }

        /// <summary>
        /// Gets or Sets Notifications
        /// </summary>
        [DataMember(Name="notifications", EmitDefaultValue=false)]
        public bool? Notifications { get; set; }

        /// <summary>
        /// Gets or Sets CalendarView
        /// </summary>
        [DataMember(Name="calendarView", EmitDefaultValue=false)]
        public string CalendarView { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AdminRecordSettings {\n");
            sb.Append("  Username: ").Append(Username).Append("\n");
            sb.Append("  Password: ").Append(Password).Append("\n");
            sb.Append("  Notifications: ").Append(Notifications).Append("\n");
            sb.Append("  CalendarView: ").Append(CalendarView).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as AdminRecordSettings);
        }

        /// <summary>
        /// Returns true if AdminRecordSettings instances are equal
        /// </summary>
        /// <param name="input">Instance of AdminRecordSettings to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AdminRecordSettings input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Username == input.Username ||
                    (this.Username != null &&
                    this.Username.Equals(input.Username))
                ) && 
                (
                    this.Password == input.Password ||
                    (this.Password != null &&
                    this.Password.Equals(input.Password))
                ) && 
                (
                    this.Notifications == input.Notifications ||
                    (this.Notifications != null &&
                    this.Notifications.Equals(input.Notifications))
                ) && 
                (
                    this.CalendarView == input.CalendarView ||
                    (this.CalendarView != null &&
                    this.CalendarView.Equals(input.CalendarView))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Username != null)
                    hashCode = hashCode * 59 + this.Username.GetHashCode();
                if (this.Password != null)
                    hashCode = hashCode * 59 + this.Password.GetHashCode();
                if (this.Notifications != null)
                    hashCode = hashCode * 59 + this.Notifications.GetHashCode();
                if (this.CalendarView != null)
                    hashCode = hashCode * 59 + this.CalendarView.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }
}
